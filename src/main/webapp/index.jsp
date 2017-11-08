
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<script type="text/javascript"
	src="<%=basePath%>js/jquery-1.11.0.min.js"></script>
<style type="text/css">
a {
	border: 1px solid rgb(73, 58, 58);
	background-color: rgb(133, 133, 133);
	height: 50px;
	line-height: 50px;
	color: white;
	text-decoration: none;
	font-weight: bold;
	padding: 5px;
	margin: 5px;
}
</style>
<script type="text/javascript">

function test() {
	var saveDataAry=[];  
    var data1={"id":"111","equipmentId":"1","equipmentAttrId":"4","configContent":"789"};  
    var data2={"id":"1111","equipmentId":"1","equipmentAttrId":"3","configContent":"789"};  
    saveDataAry.push(data1);  
    saveDataAry.push(data2);
    alert(JSON.stringify(saveDataAry));
	//Ajax发送数据给后台  
	$.ajax({
		url : "<%=basePath%>Equipment/updateEquipmentAttr",
		cache : true,
		type : "post",
		datatype : "json",
		contentType : "application/json; charset=utf-8",
		data :JSON.stringify(saveDataAry),
		success : function(data) {
			alert(data);
		}

	});

}
</script>
</head>

<body>
	<div style="margin:0 auto;width:400px;">
		<table>
		<tr>
			<th><span class="font_red"></span>上市日期</th>
			<td><input id="xx" name="ss" onclick="test()" /></td>
		</tr>
	</table>
	</div>
</body>
</html>
