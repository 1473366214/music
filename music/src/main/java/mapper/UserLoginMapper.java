package mapper;

import pojo.UserLogin;

public interface UserLoginMapper {
//登录注册功能
	public int addUser(UserLogin userLogin);//注册
	public UserLogin getUser(String id);//登录
	public int existUser(String id);//用户是否存在
}
