package service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UserMapper;
import pojo.User;
import service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	@Override
	public int addUser(Map<String, String> map) {
		return userMapper.addUser(map);
	}
	@Override
	public int existUser(String loginId) {
		// TODO 自动生成的方法存根
		return userMapper.existUser(loginId);
	}
	@Override
	public User getBaseMessage(String loginId) {
		// TODO 自动生成的方法存根
		return userMapper.getBaseMessage(loginId);
	}

}
