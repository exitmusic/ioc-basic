
package com.exitmusic.user.auth;

import com.exitmusic.user.account.UserAccountDAO;
import com.exitmusic.user.account.UserAccountDAOTestImpl;

/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class AuthenticationServiceTestCase {

	private AuthenticationService _authenticationService;

	// Is this correct or should it be UserAccountDAOImpl?
	private UserAccountDAO _userAccountDAO;

	/**
	 * Verify user account creation
	 */
	@Test
	public void testUserAccountCreate() {
		// Is this how you correctly specify the implementation?
		_userAccountDAO = new UserAccountDAOTestImpl();

		// Can you just use the interface name here?
		_authenticationService = new AuthenticationServiceImpl(_userAccountDAO);
		_authenticationService.create("testaccount");
	}

	/**
	 * Verify user account deletion
	 */
	@Test
	public void testUserAccountDelete() {
		// Code here
	}

	/**
	 * Verify user account login
	 */
	@Test
	public void testUserAccountLogin() {
		// Code here
	}
}
