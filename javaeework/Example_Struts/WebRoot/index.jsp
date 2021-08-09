<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  </head>
  <body >
  	<h3>注册</h3>
   		<s:form action="save" method="post" theme="simple">
   			<table>
   			<tr><td>用户名：</td>
   			<td><s:textfield name="xs.username"></s:textfield></td>
   			</tr><tr><td>密码：</td>
   			<td><s:textfield name="xs.password" ></s:textfield></td>
   			</tr>
<tr><td><s:submit value="添加"></s:submit></td>
   			<td><s:reset value="重置"></s:reset></td></tr>
   			</table>
   		</s:form>
  </body>
</html>