package Repositories

import Entities.UserDetails
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.*

/**
 * interface UserDetailsRepository
 *
 * @author niksinghal
 */
@Repository
interface UserDetailsRepository: CrudRepository<UserDetails, UUID> {
    /**
     * Method to find users by their phone numbers.
     *
     * @param phoneNumber The phone number of the user
     *
     * @return An iterable of UserDetails entities
     */
    fun findByPhoneNumber(phoneNumber: String): Iterable<UserDetails>
}
