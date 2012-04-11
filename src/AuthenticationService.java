/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public interface AuthenticationService {

	/**
	 * Create user account
	 * 
	 * @param userId
	 */
	void create(String userId);

	/**
	 * Delete user account
	 * 
	 * @param userId
	 */
	void delete(String userId);

	/**
	 * Login user
	 * 
	 * @param userId
	 */
	void login(String userId);
}
