package Controllers

import org.springframework.security.access.prepost.PreAuthorize
import org.springframework.web.bind.annotation.*

/**
 * Class SessionController
 *
 * @author Nikhil Singhal
 */
@RestController
class SessionController {

    @RequestMapping(value = "/login", method = arrayOf(RequestMethod.PUT))
    fun login(@RequestParam(required = true) userName: String, @RequestParam(required = true) userPassword: String): String {
        //ToDo: Figure out login logic
        return "redirect:/loginFailure"
    }

    @RequestMapping(value = "/register", method = arrayOf(RequestMethod.POST))
    fun register(): String {
        //ToDo: Figure out register logic
        return ""
    }

    @RequestMapping(value = "/loginFailure", method = arrayOf(RequestMethod.GET))
    fun loginFailure(): String = "Failed to Login to Park App\n"

    @RequestMapping(value = "/logout", method = arrayOf(RequestMethod.GET))
    fun logout(): String = "Logged Out of Park App\n"
}
