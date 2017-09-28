package Entities

import javax.persistence.Entity
import javax.persistence.Id

/**
 * class UserLogin
 *
 * @author niksinghal
 */

@Entity
data class UserLogin(
        @Id val userId: String,
        val password: String
) {}