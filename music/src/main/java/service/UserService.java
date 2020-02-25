package service;

import java.util.Map;

import pojo.User;

public interface UserService {

	int addUser(Map<String, String> map);
	int existUser(String loginId);
	User getBaseMessage(String loginId);
}
