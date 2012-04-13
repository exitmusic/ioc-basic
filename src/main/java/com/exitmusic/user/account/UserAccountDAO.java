
package com.exitmusic.user.account;

/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public interface UserAccountDAO {

	/**
	 * Delete user account
	 * 
	 * @param userId
	 */
	void deleteUser(String userId);

	/**
	 * Look up user by ID
	 * 
	 * @param userId
	 * @return Does user exist
	 */
	UserAccount lookupById(String userId);

	/**
	 * Look up user by username
	 * 
	 * @param username
	 * @return Does user exist
	 */
	UserAccount lookupByUsername(String username);

	/**
	 * Save user account
	 * 
	 * @param userAccount
	 */
	void saveUser(UserAccount userAccount);
}
