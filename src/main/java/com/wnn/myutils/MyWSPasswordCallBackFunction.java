package com.wnn.myutils;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.wss4j.common.ext.WSPasswordCallback;
import org.springframework.beans.factory.annotation.Autowired;

import com.wnn.mydao.User_Account_Mapper;

public class MyWSPasswordCallBackFunction implements CallbackHandler{
	@Autowired
	private User_Account_Mapper userMapper;

	@Override
	public void handle(Callback[] callbacks) throws IOException,
			UnsupportedCallbackException {
		WSPasswordCallback ps = (WSPasswordCallback) callbacks[0];
		String identifier = ps.getIdentifier();
		System.err.println("==========>>>>>>>>>>>============"+callbacks.length);
		System.err.println("==========>>>>>>>>>>>============"+identifier);
		String password = userMapper.getUserByName(identifier);
		
		ps.setPassword(password);
	}

}
