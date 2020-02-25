package service;

import pojo.UserLogin;

public interface UserLoginService {

	public int addUser(UserLogin userLogin);//注册
	public UserLogin getUser(String id);//登录
	public int existUser(String id);//用户是否存在
}
