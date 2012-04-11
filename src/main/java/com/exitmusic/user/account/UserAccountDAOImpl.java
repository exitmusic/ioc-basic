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
	public boolean lookupById(String userId) {
		// SELECT * FROM user WHERE user_id = userId
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#lookupByUsername(java.lang.String)
	 */
	public boolean lookupByUsername(String username) {
		// SELECT * FROM user WHERE username = username
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see UserAccountDAO#saveUser(java.lang.String)
	 */
	public void saveUser(String userId) {
		// INSERT INTO user VALUES ()
	}
}
