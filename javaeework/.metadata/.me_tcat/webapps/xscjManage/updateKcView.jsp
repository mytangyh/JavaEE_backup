<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  </head>
  <body bgcolor="#D9DFAA">
			<s:set name="kc" value="#request.kcInfo"></s:set>
			<s:form action="updateKc.action" method="post">
			<table border="0" cellspacing="1" cellpadding="8" width="400">
				<tr>
					<td>课程号：</td><td><input type="text" name="kc.kch" value="<s:property value="#kc.kch"/>" readonly/></td>
				</tr>
				<tr>
					<td>课程名：</td><td><input type="text" name="kc.kcm" value="<s:property value="#kc.kcm"/>"/></td>
				</tr>
				<tr>
					<td>开课学期：</td><td><input type="text" name="kc.kxxq" value="<s:property value="#kc.kxxq"/>"/></td>
				</tr>
				<tr>
					<td>学分：</td><td><input type="text" name="kc.xf" value="<s:property value="#kc.xf"/>"/></td>
				</tr>
				<tr>
					<td>学时：</td><td><input type="text" name="kc.xs" value="<s:property value="#kc.xs"/>"/></td>
				</tr>
			</table>
			<p>
					<input type="submit" value="修改"/>
					<input type="button" value="返回" onclick="javascript:history.back();"/>
			</s:form>
  </body>
</html>
