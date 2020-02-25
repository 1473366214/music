package mapper;

import pojo.UserMessage;

public interface UserMessageMapper {

	public int addUserMessage(String id);
	public UserMessage getUserMessage(String id);
	public int updateUserMessage(UserMessage userMessage);
}
