
package com.exitmusic.user.auth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import com.exitmusic.user.account.UserAccount;
import com.exitmusic.user.account.UserAccountDAOTestImpl;
import com.exitmusic.user.account.dao.UserAccountDAO;

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

	private UserAccount _userAccount;

	/**
	 * Setup
	 */
	@Before
	public void setUp() {
		_userAccountDAO = new UserAccountDAOTestImpl();
		_authenticationService = new AuthenticationServiceImpl(_userAccountDAO);
		_userAccount = new UserAccount("testUserId", "testUsername");
	}

	/**
	 * Verify user account creation
	 */
	@Test
	public void testUserAccountCreate() {
		_authenticationService.create(_userAccount);
		assertEquals("UserAccount was not created", _userAccount, _userAccountDAO.lookupById("testUserId"));
	}

	/**
	 * Verify user account deletion
	 */
	@Test
	public void testUserAccountDelete() {
		_authenticationService.delete(_userAccount.getUserId());
		assertNull("UserAccount was not deleted", _userAccountDAO.lookupById("testUserId"));
	}

	/**
	 * Verify user account login
	 */
	@Test
	public void testUserAccountLogin() {
		_authenticationService.login(_userAccount.getUserId());
	}
}
