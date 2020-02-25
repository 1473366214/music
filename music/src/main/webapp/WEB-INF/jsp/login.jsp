<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>登录</title>
</head>
<body>
<form id="loginMessage">
登录名：<input type="text" name="id"><br/>
    密码：<input type="password" name="pwd"><br/>
<input type="button" value="登录" id="login"/>
</form>


<script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
   $(document).ready(function(){
	   $("#login").click(function(){
		   $.ajax({
			   type:"POST",
		       url:"login.do",
		       data:$("#loginMessage").serialize(),
		       async: true,
		       error: function(request) {  //失败的话
	               alert("Connection error");  
	            }, 
	           success: function(data) {  //成功
	              if($.trim(data)=="1"){window.location.href="/music";}
	              else if($.trim(data)=="0"){alert("用户不存在");}
	              else if($.trim(data)=="2"){alert("密码错误");}
	            }
		   });
	   });
	   $("#regist").click(function(){
		   $.ajax({
			   type:"POST",
			   url:"regist.do",
		       data:$("#registMessage").serialize(),
		       async: true,
		       error: function(request) {  //失败的话
	               alert("Connection error");  
	            }, 
	           success: function(data) {  //成功
	              if($.trim(data)=="1"){
	            	  alert("注册成功");
	            	  window.location.href="index";
	            	  }
	              else if($.trim(data)=="0"){alert("改账号已注册");}
	            }
		   })
	   });
	   
   });
</script>
</body>
</html>