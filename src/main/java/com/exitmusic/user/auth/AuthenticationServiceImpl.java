
package com.exitmusic.user.auth;

import com.exitmusic.user.account.UserAccount;
import com.exitmusic.user.account.UserAccountDAO;

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

	private final UserAccountDAO _userAccountDAO;

	/**
	 * Default constructor - Is the method name correct?
	 * 
	 * @param userAccountDAO
	 */
	public AuthenticationServiceImpl(UserAccountDAO userAccountDAO) {
		_userAccountDAO = userAccountDAO;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AuthenticationService#create(java.lang.String)
	 */
	public void create(UserAccount userAccount) {
		if (_userAccountDAO.lookupById(userAccount.getUserId()) == null) {
			_userAccountDAO.saveUser(userAccount);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see AuthenticationService#delete(java.lang.String)
	 */
	public void delete(String userId) {
		if (_userAccountDAO.lookupById(userId) != null) {
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
