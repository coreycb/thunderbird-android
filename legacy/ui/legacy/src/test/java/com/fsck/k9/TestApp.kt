package com.fsck.k9

import android.app.Application
import app.k9mail.core.featureflag.FeatureFlag
import app.k9mail.core.featureflag.FeatureFlagProvider
import app.k9mail.core.featureflag.InMemoryFeatureFlagProvider
import app.k9mail.feature.telemetry.telemetryModule
import app.k9mail.legacy.account.AccountDefaultsProvider
import app.k9mail.legacy.di.DI
import com.fsck.k9.preferences.StoragePersister
import net.thunderbird.core.android.preferences.InMemoryStoragePersister
import org.koin.dsl.module
import org.mockito.Mockito.mock

class TestApp : Application() {
    override fun onCreate() {
        Core.earlyInit()

        super.onCreate()
        DI.start(
            application = this,
            modules = coreModules + commonAppModules + uiModules + telemetryModule + testModule,
            allowOverride = true,
        )

        K9.init(this)
        Core.init(this)
    }
}

val testModule = module {
    single { AppConfig(emptyList()) }
    single<CoreResourceProvider> { TestCoreResourceProvider() }
    single<StoragePersister> { InMemoryStoragePersister() }
    single<AccountDefaultsProvider> { mock<AccountDefaultsProvider>() }
    single<FeatureFlagProvider> {
        InMemoryFeatureFlagProvider(
            featureFlagFactory = {
                emptyList<FeatureFlag>()
            },
        )
    }
}
