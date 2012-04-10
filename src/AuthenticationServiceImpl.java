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

	public void create() {
		_userAccountDAO.saveUser();
	}

	public void delete() {
		_userAccountDAO.deleteUser();
	}

	public void login() {
		// login code
	}
}
