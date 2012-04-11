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
	boolean lookupById(String userId);

	/**
	 * Look up user by username
	 * 
	 * @param username
	 * @return Does user exist
	 */
	boolean lookupByUsername(String username);

	/**
	 * Save user account
	 * 
	 * @param userId
	 */
	void saveUser(String userId);
}
