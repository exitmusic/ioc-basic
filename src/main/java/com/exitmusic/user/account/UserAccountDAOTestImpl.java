
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
		UserAccount testUserAccount = new UserAccount(userId, "testUsername");

		return testUserAccount;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see com.exitmusic.user.account.UserAccountDAO#lookupByUsername(java.lang.String)
	 */
	public UserAccount lookupByUsername(String username) {
		UserAccount testUserAccount = new UserAccount("testUserId", username);

		return testUserAccount;
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
