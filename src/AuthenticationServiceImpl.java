/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class AuthenticationServiceImpl
	implements AuthenticationService
{

	private UserAccountDAO _userAccountDAO;

	/**
	 * {@inheritDoc}
	 * 
	 * @see AuthenticationService#create(java.lang.String)
	 */
	public void create(String userId) {
		if (!_userAccountDAO.lookupById(userId)) {
			_userAccountDAO.saveUser(userId);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AuthenticationService#delete(java.lang.String)
	 */
	public void delete(String userId) {
		if (_userAccountDAO.lookupById(userId)) {
			_userAccountDAO.deleteUser(userId);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AuthenticationService#login(java.lang.String)
	 */
	public void login(String userId) {
		// login code
	}
}
