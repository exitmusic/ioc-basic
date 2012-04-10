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
	 */
	void deleteUser();

	/**
	 * Look up user by ID
	 */
	void lookupById();

	/**
	 * Look up user by username
	 */
	void lookupByUsername();

	/**
	 * Save user account
	 */
	void saveUser();
}
