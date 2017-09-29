package Entities

import org.hibernate.annotations.GenericGenerator
import java.io.Serializable
import javax.persistence.*

/**
 * class UserDetails
 *
 * @author niksinghal
 */
@Entity
@Table(name = "user_details")
data class UserDetails(
        /**
         * The UserId field for the user details table.
         */
        @Id @GeneratedValue(generator = "uuid2") @GenericGenerator(name = "uuid2", strategy = "uuid2")
        @Column(name = "user_id") var userId: Byte,
        /**
         * The first name field for the user details table.
         */
        @Column(name = "first_name") var firstName: String,
        /**
         * The last name field for the user details table.
         */
        @Column(name = "last_name") var lastName: String,
        /**
         * The phone number field for the user details table.
         */
        @Column(name = "phone_number") var phoneNumber: String,
        /**
         * The rating table for the user details table.
         */
        @Column(name = "rating") var rating: Double,
        /**
         * The user login information containing the password for the user.
         */
        @OneToOne(cascade = arrayOf(CascadeType.ALL)) @PrimaryKeyJoinColumn
        var userLogin: UserLogin
): Serializable {

    @Suppress("unused")
    constructor() : this("".toByte(), "", "", "", 0.0, UserLogin())

    companion object {
        @JvmStatic val serialVersionUID: Long = 1L
    }
}
