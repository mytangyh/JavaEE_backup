<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sx" uri="/struts-dojo-tags" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<sx:head />
</head>

<body>
<h1>Struts2 datetimepicker 示例</h1>

<s:form action="resultAction" namespace="/" method="POST" >

<sx:datetimepicker name="date1" label="Format (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" value="todayDate" />

<sx:datetimepicker name="date2" label="Format (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" value="%{'2010-01-01'}"/>

<sx:datetimepicker name="date3" label="Format (dd-MMM-yyyy)" displayFormat="dd-MMM-yyyy" value="%{'today'}"/>


<s:submit value="submit" name="submit" />
	
</s:form>

</body>
</html>