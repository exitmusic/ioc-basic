
package com.exitmusic.user.account;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.exitmusic.user.account.dao.UserAccountDAO;
import com.exitmusic.user.account.dao.UserAccountDAOImpl;

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
		_userAccountDAO = new UserAccountDAOImpl();
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
		final UserAccount expectedUserAccount = new UserAccount("testUserId", "testUsername");
		final UserAccount actualUserAccount = _userAccountDAO.lookupById("testUserId");

		assertEquals("UserAccount object not returned", expectedUserAccount, actualUserAccount);
		assertEquals("Returned UserAccount userId does not match", "testUserId", actualUserAccount.getUserId());
		assertEquals("Returned UserAccount username does not match", "testUsername", actualUserAccount.getUsername());
	}

	/**
	 * Verify lookup by username
	 */
	@Test
	public void testLookupByUsername() {
		final UserAccount expectedUserAccount = new UserAccount("testUserId", "testUsername");
		final UserAccount actualUserAccount = _userAccountDAO.lookupByUsername("testUserId");

		assertEquals("UserAccount object not returned", expectedUserAccount, actualUserAccount);
		assertEquals("Returned UserAccount username does not match", "testUsername", actualUserAccount.getUsername());
		assertEquals("Returned UserAccount userId does not match", "testUserId", actualUserAccount.getUserId());
	}

	/**
	 * Verify save user
	 */
	@Test
	public void testSaveUser() {
		final UserAccount expectedUserAccount = new UserAccount("testUserId", "testUsername");

		_userAccountDAO.saveUser(expectedUserAccount);
	}
}
