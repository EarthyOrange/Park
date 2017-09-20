package Controllers

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class WelcomeController {

    @RequestMapping("/")
    fun index(): String = "Welcome to the Park app\n"
}