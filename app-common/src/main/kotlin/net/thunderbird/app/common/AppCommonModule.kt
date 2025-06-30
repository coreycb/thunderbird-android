package net.thunderbird.app.common

import net.thunderbird.app.common.account.appCommonAccountModule
import org.koin.core.module.Module
import org.koin.dsl.module

val appCommonModule: Module = module {
    includes(
        appCommonAccountModule,
    )
}
