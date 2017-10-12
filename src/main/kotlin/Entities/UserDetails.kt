package Entities

import org.hibernate.annotations.GenericGenerator
import org.hibernate.annotations.Type
import java.io.Serializable
import java.util.*
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
         * The area code field for the user details table.
         */
        @Column(name = "area_code") var areaCode: String,
        /**
         * The rating field for the user details table.
         */
        @Column(name = "rating") var rating: Double
): Serializable {

    /**
     * The UserId field for the user details table.
     */
    @Id @Type(type = "uuid-binary")
    @GeneratedValue(generator = "uuid2") @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "user_id")
    var userId: UUID? = null

    @OneToOne(cascade = arrayOf(CascadeType.ALL))
    @PrimaryKeyJoinColumn
    var userLogin: UserLogin? = null

    @Suppress("unused")
    constructor(): this("", "", "", "", 0.0)

    companion object {
        @JvmStatic val serialVersionUID: Long = 1L
    }
}
