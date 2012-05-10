
package com.exitmusic.user.account.dao;

import com.exitmusic.user.account.UserAccount;

/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class UserAccountDAOImpl
	implements UserAccountDAO
{

	/**
	 * Constructor
	 */
	public UserAccountDAOImpl() {
		// super();?
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#deleteUser(java.lang.String)
	 */
	public boolean deleteUser(String userId) {
		boolean success = false;
		// DELETE FROM user WHERE user_id = userId
		return success;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#lookupById(java.lang.String)
	 */
	public UserAccount lookupById(String userId) {
		// SELECT * FROM user WHERE user_id = userId
		UserAccount user = new UserAccount(userId, "testUsername");

		return user;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#lookupByUsername(java.lang.String)
	 */
	public UserAccount lookupByUsername(String username) {
		// SELECT * FROM user WHERE username = username
		UserAccount user = new UserAccount("testUserId", username);

		return user;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.dao.UserAccountDAO#saveUser(com.exitmusic.user.account.UserAccount)
	 */
	public boolean saveUser(UserAccount userAccount) {
		boolean success = false;
		// INSERT INTO user VALUES ()
		return success;
	}
}
