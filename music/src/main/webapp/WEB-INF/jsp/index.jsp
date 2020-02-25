<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>index</title>
<script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script>

</head>
<body>
<h4 id="userName">aaa</h4>
<img alt="ico" src="static/profilePicture/m1.jpg" width="200px" id = "userIco">


<script type="text/javascript" src="static/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
    	$.ajax({
			   type:"POST",
		       url:"getUserIndexMessage",
		       error: function(request) {  //失败的话
	               alert("Connection error");  
	            }, 
	           success: function(data) {  //成功
	              if(data!=null){
	            	  $("#userName").text(data.id);
	            	  $("#userIco").attr("src",data.profilepicture);
	              }
	            }
		   });
    });

</script>
</body>
</html>