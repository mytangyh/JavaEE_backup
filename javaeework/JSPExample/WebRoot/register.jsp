<%@ page language="java" pageEncoding="gb2312"%>
<html>
		<head>
    		<title>�������԰�</title>
    		<link rel="stylesheet" href="css/style.css">
  	</head>
  	<body bgcolor=#76b852>
        <div class="login-page">
            <div class="form">

                <form action="RegisterServlet" method="POST">
                    <input type="text" name="username" placeholder="�û���"><br>
                    <input type="password" name="pwd" placeholder="����"><br>
                    <input id="sub" type="submit" value="ע��">
                    <p class="message">�����˺ţ�
                        <a href="login.jsp">������¼</a></p>

            </div>
        </div>
    </form>

</html>