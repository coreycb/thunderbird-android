plugins {
    id(ThunderbirdPlugins.Library.android)
}

android {
    namespace = "net.thunderbird.app.common"
}

dependencies {
    api(projects.legacy.common)

    api(projects.legacy.ui.legacy)

    api(projects.feature.account.core)

    api(projects.feature.launcher)

    api(projects.feature.navigation.drawer.api)

    implementation(projects.legacy.core)
    implementation(projects.legacy.account)

    implementation(projects.core.account)

    implementation(projects.core.featureflags)
    implementation(projects.core.ui.legacy.theme2.common)

    implementation(projects.feature.account.setup)
    implementation(projects.feature.migration.provider)

    implementation(projects.mail.protocols.imap)
}
