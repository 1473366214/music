package controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import mapper.UserMapper;
import pojo.User;

@Controller
public class UserController {

	@Autowired
	UserMapper userMapper;
	@ResponseBody
	@RequestMapping("registss.do")
	public String regist(@RequestParam(value="loginId",required=true) String loginId,@RequestParam(value="loginPwd",required=true) String loginPwd) {
		if(userMapper.existUser(loginId)==0) {
			Map<String, String> map = new HashMap<String,String>();
			map.put("loginId", loginId);
			map.put("loginPwd", loginPwd);
			 userMapper.addUser(map);
			 return "success";
		}else
			return "userExist";
		
	}
	
	@ResponseBody
	@RequestMapping("loginss.do")
	public String login(@RequestParam(value="loginId",required=true) String loginId,@RequestParam(value="loginPwd",required=true) String loginPwd,HttpServletRequest request) {
		if(userMapper.existUser(loginId)!=1) {
			return "notExist";
		}else {
			User user = userMapper.getBaseMessage(loginId);
			if(user.getLoginPwd().equals(loginPwd)) {
			    user.setLoginId(loginId);
			    request.getSession().setAttribute("userLogin", user);
			    return "sucess";
			}else
				return "error";
		}
	}
}
