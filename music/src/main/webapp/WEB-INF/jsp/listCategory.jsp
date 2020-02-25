<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*"%>
 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 
 <br>
 <input type="button" value="testJson" id="testJson"/>
 <br>
 
<script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
    	$("#testAjax").click(function(){
    		//通过ajax请求springmvc
    		var data = $("#ajaxForm").serialize();  
    		$.post("testAjax",//服务器地址
    				data,
    				function(result){//回调函数
    					alert(result);
    				});
    	    });
    	
    	$("#testAjax1").click(function(){
    		$.ajax({
 			   type:"POST",
 		       url:"testAjax",
 		       data:$("#ajaxForm").serialize(),
 		       async: true,
 		       error: function(request) {  //失败的话
 	               alert("Connection error");  
 	            }, 
 	           success: function(data) {  //成功
 	              alert(data);
 	            }
 		   });
        });
    	$("#testSer").click(function(){
    		var date = $("ajaxForm").serialize();
    		$("#registMessage").text("abc"+date);
    	});
    	
    });

    
</script>
<audio src="music/弦子 - 醉清风.mp3" controls="controls"></audio>
<br>
<form action="testUpload" enctype="multipart/form-data" method="post">
    <input type="text" name="desc"><br/>
    <input type="file" name="file"><br/>
    <input type="submit" value="提交"><br/>
</form>
<br>
<form id="ajaxForm">
     登录名：<input type="text" name="id"><br/>
    密码：<input type="password" name="pwd"><br/>
<input type="button" value="testAjax" id="testAjax"/>
</form>
<br>
<input type="button" value="testSer" id="testSer"/>
<p id="registMessage"></p>





<script>
$(document).ready(function(){
	$("button").click(function(){
		$("div").text($("#ajaxForm").serialize());
	});
});
</script>
</head>
<body>

<form action="" id="form1">
第一个名称: <input type="text" name="FirstName" value="Mickey" /><br>
最后一个名称: <input type="text" name="LastName" value="Mouse" /><br>
</form>
<button>序列化表单值</button>
<div></div>


