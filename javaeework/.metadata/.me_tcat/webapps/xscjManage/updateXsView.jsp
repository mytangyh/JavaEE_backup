<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
  <head>
  	 <script type="text/javascript" src="images/calendar.js"></script>
  	
  </head>
  <body bgcolor="#D9DFAA">
			<s:set name="xs" value="#request.xsInfo"></s:set>
			<s:form action="updateXs.action" method="post" enctype="multipart/form-data" >
			<table border="0" cellspacing="1" cellpadding="8" width="500">
				<tr>
					 <td  width="80">学号：</td><td><input type="text" name="xs.xh" value="<s:property value="#xs.xh"/>" readonly/></td>
				</tr>
				<tr>
					<td width="80">姓名：</td><td><input type="text" name="xs.xm" value="<s:property value="#xs.xm"/>"/></td>
				</tr>
				<tr>
					<td width="80"><s:radio list="#{1:'男',0:'女'}" value="#xs.xb" label="性别" name="xs.xb"></s:radio></td>
				</tr>
				<tr>
					<td width="80">专业：</td>
					<td>
						<select name="xs.zyb.id">
							<s:iterator value="#request.zys" id="zy">
								<option value="<s:property value="#zy.id"/>"><s:property value="#zy.zym"/></option>
							</s:iterator>
						</select>
					</td>
				</tr>
				<tr>
					<td width="80">出生时间：</td>
					<td><input type="text" name="xs.cssj" value="<s:date name="#xs.cssj" format="yyyy-MM-dd"/>" onclick="calendar();" readonly/></td>
				</tr>
				<tr>
					<td width="80">总学分：</td><td><input type="text" name="xs.zxf" value="<s:property value="#xs.zxf"/>"/></td>
				</tr>
				<tr>
					<td width="80">备注：</td><td><input type="text" name="xs.bz" value="<s:property value="#xs.bz"/>"/></td>
				</tr>
				<tr>
					<td>照片</td><td><input type="file" name="zpfile" value=""/></td>
				</tr>
			</table>
					<input type="submit" value="修改"/>
					<input type="button" value="返回" onclick="javascript:history.back();"/>
			</s:form>
			<!-- 这里用JavaScript来实现根据该学生的专业ID来显示专业名 -->
			 <script type="text/javascript">
  				document.getElementById("xs.zyb.id").value= <s:property value="#xs.zyb.id"/>
  			</script>
  </body>

</html>
