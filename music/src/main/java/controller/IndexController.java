package controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import mapper.UserMapper;
import pojo.UserLogin;

@Controller
public class IndexController {

	@Autowired
	UserMapper userMapper;
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@ResponseBody
	@RequestMapping("getUserIndexMessage")
	public UserLogin getUserLogin(HttpServletRequest request) {
		UserLogin userLogin = (UserLogin) request.getSession().getAttribute("userLogin");
		return userLogin;
	}
}
