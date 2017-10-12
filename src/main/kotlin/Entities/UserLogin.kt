package Entities

import java.io.Serializable
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * class UserLogin
 *
 * @author niksinghal
 */
@Entity
@Table(name = "user_login_details")
data class UserLogin(
        /**
         * The password field
         */
        @Column(name = "password") var password: String
): Serializable {

    @Id
    @Column(name = "user_id")
    var userId: UUID? = null

    @Suppress("unused")
    constructor(): this("")

    companion object {
        @JvmStatic val serialVersionUID: Long = 1L
    }
}