
package com.exitmusic.user.auth;

import org.junit.Before;
import org.junit.Test;

import com.exitmusic.user.account.UserAccount;
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

	private UserAccount testUserAccount;

	/**
	 * Setup
	 */
	@Before
	public void setUp() {
		_userAccountDAO = new UserAccountDAOTestImpl();
		_authenticationService = new AuthenticationServiceImpl(_userAccountDAO);
		testUserAccount = new UserAccount("testUserId", "testUsername");
	}

	/**
	 * Verify user account creation
	 */
	@Test
	public void testUserAccountCreate() {
		// How to test if account is created?
		_authenticationService.create(testUserAccount);
	}

	/**
	 * Verify user account deletion
	 */
	@Test
	public void testUserAccountDelete() {
		_authenticationService.delete(testUserAccount.getUserId());
	}

	/**
	 * Verify user account login
	 */
	@Test
	public void testUserAccountLogin() {
		_authenticationService.login(testUserAccount.getUserId());
	}
}
