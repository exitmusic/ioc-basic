
package com.exitmusic.user.auth;

import org.junit.Test;

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

	private UserAccountDAO _userAccountDAO;

	/**
	 * Verify user account creation
	 */
	@Test
	public void testUserAccountCreate() {
		_userAccountDAO = new UserAccountDAOTestImpl();
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
