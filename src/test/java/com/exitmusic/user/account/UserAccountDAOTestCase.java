
package com.exitmusic.user.account;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class UserAccountDAOTestCase {

	private UserAccountDAO _userAccountDAO;

	/**
	 * Setup
	 */
	@Before
	public void setUp() {
		_userAccountDAO = new UserAccountDAOTestImpl();
	}

	/**
	 * Verify delete user
	 */
	@Test
	public void testDeleteUser() {
		_userAccountDAO.deleteUser("testUserId");
	}

	/**
	 * Verify lookup by ID
	 */
	@Test
	public void testLookupById() {
		UserAccount testUserAccount = new UserAccount("testUserId", null);

		assertEquals(testUserAccount, _userAccountDAO.lookupById("testUserId"));
	}

	/**
	 * Verify lookup by username
	 */
	@Test
	public void testLookupByUsername() {
		UserAccount testUserAccount = new UserAccount("testUserId", "testUsername");

		assertEquals(testUserAccount, _userAccountDAO.lookupById("testUsername"));
	}

	/**
	 * Verify save user
	 */
	@Test
	public void testSaveUser() {
		UserAccount testUserAccount = new UserAccount("testUserId", "testUsername");

		_userAccountDAO.saveUser(testUserAccount);
	}
}
