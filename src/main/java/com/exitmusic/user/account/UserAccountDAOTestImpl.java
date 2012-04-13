
package com.exitmusic.user.account;

/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:123fakestreet">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class UserAccountDAOTestImpl
	implements UserAccountDAO
{

	/**
	 * Constructor
	 */
	public UserAccountDAOTestImpl() {
		// super(); ?
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.UserAccountDAO#deleteUser(java.lang.String)
	 */
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.UserAccountDAO#lookupById(java.lang.String)
	 */
	public UserAccount lookupById(String userId) {
		// Simulate the user does not exist
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.UserAccountDAO#lookupByUsername(java.lang.String)
	 */
	public UserAccount lookupByUsername(String username) {
		// Simulate the user does not exist
		return null;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.UserAccountDAO#saveUser(com.exitmusic.user.account.UserAccount)
	 */
	public void saveUser(UserAccount userAccount) {
		// TODO Auto-generated method stub

	}

}
