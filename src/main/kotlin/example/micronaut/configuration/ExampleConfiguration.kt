package example.micronaut.configuration

import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("example")
class ExampleConfiguration {
    var awsTest: String? = null
}