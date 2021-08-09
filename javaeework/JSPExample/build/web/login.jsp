<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/styles.css">
	

  </head>
  
  <body bgcolor=#76b852>
        <div class="login-page">
            <div class="form">

                <form action="mainServlet" method="POST">
                    <input type="text" name="name" placeholder="用户名"><br>
                    <input type="password" name="pwd" placeholder="密码"><br>
                    <input id="sub" type="submit" value="登录">
                    <p class="message">还没有账号？
                        <a href="register.jsp">立即注册</a></p>

            </div>
        </div>
    </form>
</body>
</html>
