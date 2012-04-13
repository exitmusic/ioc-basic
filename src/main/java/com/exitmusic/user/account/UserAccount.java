
package com.exitmusic.user.account;

/**
 * Description: Description goes here.
 * 
 * @author <a href="mailto:kchang@gohealth.com">Kai Chang</a>
 * @version $Revision$ $Date$
 * @since 0.1
 */
public class UserAccount {

	private String _userId;

	private String _username;

	/**
	 * Constructor
	 * 
	 * @param userId
	 * @param username
	 */
	public UserAccount(String userId, String username) {
		_userId = userId;
		_username = username;
	}

	/**
	 * @return userId
	 */
	public String getUserId() {
		return _userId;
	}

	/**
	 * @return username
	 */
	public String getUsername() {
		return _username;
	}

	/**
	 * @param userId
	 */
	public void setUserId(String userId) {
		_userId = userId;
	}

	/**
	 * @param username
	 */
	public void setUsername(String username) {
		_username = username;
	}
}
