plugins {
    id("com.mkobit.jenkins.pipelines.shared-library") version "0.10.1"
    id("groovy")
}

repositories {
    mavenCentral()
}

sourceSets {
    test {
        withConvention(GroovySourceSet::class) {
            groovy {
                setSrcDirs(listOf("test"))
            }
        }
    }
}

tasks {
    test {
        ignoreFailures = true
        testLogging.showExceptions = true
        testLogging.showStandardStreams = true
        testLogging{
            events("PASSED","FAILED","SKIPPED")
        }
    }
}

dependencies {
    implementation("org.codehaus.groovy:groovy-all:2.5.4")
    testImplementation("com.lesfurets", "jenkins-pipeline-unit", "1.3")
    testImplementation ("org.spockframework","spock-core","1.3-groovy-2.5")
    testImplementation("org.hamcrest:hamcrest:2.2")
}