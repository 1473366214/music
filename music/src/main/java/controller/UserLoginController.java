package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mapper.UserLoginMapper;
import pojo.UserLogin;

@Controller
public class UserLoginController {

	@Autowired
	UserLoginMapper userLoginMapper;
	//注册功能
	@ResponseBody
	@RequestMapping("regist.do")
	public String regist(UserLogin userLogin) {
		if(userLoginMapper.existUser(userLogin.getId())==1) {
			return "0";//失败
		}else {
			userLogin.setProfilepicture("static/profilePicture/0.jpg");
			userLoginMapper.addUser(userLogin);
			return "1";
		}
	}
	//登录功能
	@ResponseBody
	@RequestMapping("login.do")
	public String login(UserLogin userLogin,HttpServletRequest request) {
		String newId = userLogin.getId();
        if(userLoginMapper.existUser(newId)!=1) {
        	return "0";
        }
        UserLogin oldUserLogin = userLoginMapper.getUser(newId);
        if(oldUserLogin.getPwd().equals(userLogin.getPwd())) {
        	userLogin.setProfilepicture(oldUserLogin.getProfilepicture());
        	request.getSession().setAttribute("userLogin", userLogin);
        	return "1";
        }else {
        	return "2";
        }
		
	}
}
