package example.micronaut
import example.micronaut.configuration.ExampleConfiguration
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Post
import java.util.UUID
import javax.inject.Inject
import javax.validation.Valid

@Controller
open class BookController {

    @Inject
    lateinit var exampleConfiguration: ExampleConfiguration

    @Post
    open fun save(@Valid @Body book: Book): String? {
        println(exampleConfiguration.awsTest)
        return exampleConfiguration.awsTest
    }
}