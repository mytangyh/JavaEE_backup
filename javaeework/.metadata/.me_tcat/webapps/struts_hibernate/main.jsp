<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>学生选课系统</title>
  </head>
  <frameset rows="30%,*" border="0">
  	<frame src="head.jsp">
  	<frameset cols="15%,*" border="1">
  		<frame src="left.jsp">
  		<frame src="right.jsp" name="right">
  	</frameset>
  </frameset>
</html>