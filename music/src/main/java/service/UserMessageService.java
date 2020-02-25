package service;

import pojo.UserMessage;

public interface UserMessageService {
	public int addUserMessage(String id);
	public UserMessage getUserMessage(String id);
	public int updateUserMessage(UserMessage userMessage);
}
