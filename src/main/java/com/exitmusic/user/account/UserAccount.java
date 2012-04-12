
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

	public String getUserId() {
		return _userId;
	}

	public String getUsername() {
		return _username;
	}

	public void setUserId(String userId) {
		_userId = userId
	}

	public void setUsername(String username) {
		_username = username;
	}
}
