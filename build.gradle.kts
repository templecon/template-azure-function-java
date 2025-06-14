plugins {
	`version-catalog`
	alias(libs.plugins.kotlin.jvm)
	alias(libs.plugins.serialization)
	alias(libs.plugins.ktor)
}
repositories {
	mavenCentral()
}

kotlin {
	jvmToolchain(8)
	
}

dependencies {
	implementation(libs.bundles.ktor.server)
	implementation(libs.sealization.json)
	implementation(libs.mcp)
}
application {
	mainClass.set("com.example.MainKt")
}