package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UserLoginMapper;
import pojo.UserLogin;
import service.UserLoginService;

@Service
public class UserLoginServiceImpl implements UserLoginService {

	@Autowired
	UserLoginMapper userLoginMapper;
	@Override
	public int addUser(UserLogin userLogin) {
		return userLoginMapper.addUser(userLogin);
	}

	@Override
	public UserLogin getUser(String id) {
		return userLoginMapper.getUser(id);
	}

	@Override
	public int existUser(String id) {
		return userLoginMapper.existUser(id);
	}

}
