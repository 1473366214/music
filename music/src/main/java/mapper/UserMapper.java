package mapper;

import java.util.Map;

import pojo.User;

public interface UserMapper {

	public int addUser(Map<String, String> map);
	
	public int existUser(String loginId);
	
	public User getBaseMessage(String loginId);
//	public int updateMessage(User user);
//	
//	public User getUser(String loginId);
}
