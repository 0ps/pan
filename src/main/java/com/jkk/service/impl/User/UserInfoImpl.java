package com.jkk.service.impl.User;

import com.jkk.dao.impl.User.UserInfoDAOimpl;
import com.jkk.model.User;
import com.jkk.model.UserInfo;
import com.jkk.service.inter.User.UserInfoBiz;
import com.jkk.utils.StampDate;

public class UserInfoImpl implements UserInfoBiz {
	private UserInfoDAOimpl userInfoDAOimpl;
	public UserInfoImpl(User user){
		userInfoDAOimpl = new UserInfoDAOimpl(user.getUserId());
	}
	@Override
	public UserInfo getInfo() {
		UserInfo userInfo = userInfoDAOimpl.getInfo();
		userInfo.setLastLoginTime(StampDate.stampToDate(userInfo.getLastLoginTime()));
		return userInfo;
	}

	@Override
	public boolean updateAll(UserInfo userInfo) {
		return userInfoDAOimpl.updateAll(userInfo);
	}

	@Override
	public boolean updateUserName(String val) {
		return userInfoDAOimpl.updateUserName(val);
	}

	@Override
	public boolean updateSex(String val) {
		return userInfoDAOimpl.updateSex(val);
	}

	@Override
	public boolean updateEMail(String val) {
		return userInfoDAOimpl.updateEMail(val);
	}

	@Override
	public boolean updatePhone(String val) {
		return userInfoDAOimpl.updatePhone(val);
	}

	@Override
	public boolean updateWebSite(String val) {
		return userInfoDAOimpl.updateWebSite(val);
	}

	@Override
	public boolean updateLocation(String val) {
		return userInfoDAOimpl.updateLocation(val);
	}

	@Override
	public boolean updateMaxSize(String val) {
		return userInfoDAOimpl.updateMaxSize(val);
	}

	@Override
	public boolean updateLastLoginTime(String val) {
		return userInfoDAOimpl.updateLastLoginTime(val);
	}

	@Override
	public boolean updateImg(String val) {
		return userInfoDAOimpl.updateImg(val);
	}
}