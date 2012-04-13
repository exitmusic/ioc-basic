
package com.exitmusic.user.account;

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

	}
}
