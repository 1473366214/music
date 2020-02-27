package mapper;

import pojo.UserMessage;

public interface UserMessageMapper {

	//增加新用户
	public int addUserMessage(String id);
	//获取用户信息
	public UserMessage getUserMessage(String id);
	//更新用户信息
	public int updateUserMessage(UserMessage userMessage);
}
