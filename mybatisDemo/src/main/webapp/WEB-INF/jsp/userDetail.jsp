<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        tr {
            text-align: left;
        }
    </style>
</head>
<body>
<table class="table table-striped table-hover table-condensed">
    <tr>
        <th>用户名</th>
        <td>${userDetail.userName}</td>
    </tr>
    <tr>
        <th>爱好</th>
        <td>${userDetail.userHobby}</td>
    </tr>
    <tr>
        <th>旅游目的地</th>
        <td>${userDetail.travelCity}</td>
    </tr>
    <tr>
        <th>费用</th>
        <td>${userDetail.price}</td>
    </tr>
    <tr>
        <th>所在省份</th>
        <td>${userDetail.province}</td>
    </tr>
</table>
</body>
</html>
