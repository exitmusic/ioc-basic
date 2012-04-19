
package com.exitmusic.user.auth;

import com.exitmusic.user.account.UserAccount;
import com.exitmusic.user.account.dao.UserAccountDAO;

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
		// TODO Need to import springframework
		// Assert.notNull(userAccountDAO, "userAccountDAO is required");

		_userAccountDAO = userAccountDAO;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.auth.AuthenticationService#create(com.exitmusic.user.account.UserAccount)
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
