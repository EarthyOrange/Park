import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackageClasses = arrayOf(Controllers.Controllers::class))
@EntityScan(basePackageClasses = arrayOf(Entities.Entities::class))
@EnableJpaRepositories(basePackageClasses = arrayOf(Repositories.Repositories::class))
open class Application {

    private val log = LoggerFactory.getLogger(Application::class.java)

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(Application::class.java, *args)
        }
    }
}
