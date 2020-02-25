package service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.UserMessageMapper;
import pojo.UserMessage;
import service.UserMessageService;

@Service
public class UserMessageServiceImpl implements UserMessageService {
    @Autowired
    UserMessageMapper userMessageMapper;

	@Override
	public int addUserMessage(String id) {
		return userMessageMapper.addUserMessage(id);
	}

	@Override
	public UserMessage getUserMessage(String id) {
		return userMessageMapper.getUserMessage(id);
	}

	@Override
	public int updateUserMessage(UserMessage userMessage) {
		return userMessageMapper.updateUserMessage(userMessage);
	}
    
}
