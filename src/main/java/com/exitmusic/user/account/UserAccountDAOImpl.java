
package com.exitmusic.user.account;

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
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#deleteUser(java.lang.String)
	 */
	public void deleteUser(String userId) {
		// DELETE FROM user WHERE user_id = userId
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#lookupById(java.lang.String)
	 */
	public UserAccount lookupById(String userId) {
		// SELECT * FROM user WHERE user_id = userId
		UserAccount user;

		return user;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#lookupByUsername(java.lang.String)
	 */
	public UserAccount lookupByUsername(String username) {
		// SELECT * FROM user WHERE username = username
		UserAccount user;

		return user;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.UserAccountDAO#saveUser(com.exitmusic.user.account.UserAccount)
	 */
	public void saveUser(UserAccount userAccount) {
		// INSERT INTO user VALUES ()
	}
}
