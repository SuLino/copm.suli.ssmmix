<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/10/23
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
    <p>学生注册</p>
    <form action="student/addStudent.do" method="post">
        姓名：<label>
        <input type="text" name="name"><br>
    </label>
        年龄：<label>
        <input type="text" name="age">
    </label>
        <input type="submit" value="提交">
    </form>
</div>
</body>
</html>
