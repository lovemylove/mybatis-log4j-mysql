
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="post-edit" method="post">
    <input type="hidden" name="userId" value="${user.userId}">
    用户姓名：<input type="text" name="userName" value="${user.userName}"/>
    用户爱好：<input type="text" name="userHobby" value="${user.userHobby}">
    旅游目的地：<input type="text" name="travelCity" value="${user.travelCity}">
    是否有效用户：<form>
			    <select id="isValid" name="isValid" value="${user.isValid}"> 
			    	<option style="color:gray">请选择……</option>
			        <option value="1">是</option> 
			        <option value="0">否</option> 
			    </select> 
			</form>
    <input type="submit" value="提交">
</form>
</body>
</html>
