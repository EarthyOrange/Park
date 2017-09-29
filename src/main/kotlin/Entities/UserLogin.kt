package Entities

import java.io.Serializable
import javax.persistence.*

/**
 * class UserLogin
 *
 * This table is supposed to be temporary. The frontend has to run on mobile devices which will be using the OTP through
 * SMS to login to the app. Once that is done there is no need for this table and can be safely deleted w/o having to
 * modify a huge user_details table.
 *
 * @author niksinghal
 */
@Entity
@Table(name = "user_login_details")
data class UserLogin(
        /**
         * The user ID field for the login table.
         * This value is a shared primary key and it is populated by the UserDetails.userId field
         */
        @Id @Column(name = "user_id") @OneToOne(mappedBy = "user_id") var userId: Byte,
        /**
         * The password field for the login table.
         * It has to store the encrypted password.
         */
        @Column(name = "password", nullable = false) var password: String
): Serializable {

    @Suppress("unused")
    constructor() : this("".toByte(), "")

    companion object {
        @JvmStatic val serialVersionUID: Long = 1L
    }
}
