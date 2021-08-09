<%@ page language="java" pageEncoding="gb2312"%>
<html>
		<head>
    		<title>简易留言板</title>
    		<link rel="stylesheet" href="css/style.css">
  	</head>
  	<body bgcolor=#76b852>
        <div class="login-page">
            <div class="form">

                <form action="RegisterServlet" method="POST">
                    <input type="text" name="username" placeholder="用户名"><br>
                    <input type="password" name="pwd" placeholder="密码"><br>
                    <input id="sub" type="submit" value="注册">
                    <p class="message">已有账号？
                        <a href="login.jsp">立即登录</a></p>

            </div>
        </div>
    </form>

</html>