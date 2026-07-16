subprojects {
    group = "dev.brights0ng.stelladyne"
    version = "1.0-SNAPSHOT"

    plugins.withId("java") {
        extensions.configure<JavaPluginExtension> {
            toolchain {
                languageVersion.set(JavaLanguageVersion.of(21))
            }
        }
    }
}