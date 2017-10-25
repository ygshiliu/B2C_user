package com.wnn.myservice;

import org.springframework.beans.factory.annotation.Autowired;

import com.wnn.mybean.T_mall_user_account;
import com.wnn.mydao.User_Account_Mapper;
import com.wnn.myutils.MyDatasourceSwitch;


public class UserServiceImpl implements UserServiceInf {
	
	@Autowired
	private User_Account_Mapper user_Account_Mapper;

	@Override
	public T_mall_user_account login(T_mall_user_account user) {
		MyDatasourceSwitch.setKey("user");
		T_mall_user_account login = user_Account_Mapper.login(user);
		return login;
	}
	@Override
	public T_mall_user_account test_login(T_mall_user_account user) {
		MyDatasourceSwitch.setKey("tester");
		T_mall_user_account login = user_Account_Mapper.login(user);
		return login;
	}

	@Override
	public boolean regist(T_mall_user_account user) {
		int count = user_Account_Mapper.regist(user);
		return count>0?true:false;
	}

}
