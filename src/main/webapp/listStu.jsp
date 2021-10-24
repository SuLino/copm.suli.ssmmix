<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2021/10/24
  Time: 12:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生列表</title>
    <script type="text/javascript" src="js/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            //页面加载的时候就执行ajax初始化页面
            getInfo()
            $("#doAjax").click(function () {
               getInfo()
            })
        })
        //将ajax抽取成函数，复用
        function getInfo() {
            $.ajax({
                    url:"student/queryStu.do",
                    dataType:"json",
                    success:function (data) {
                        $("#info").empty()
                        $.each(data, function (i,val) {
                            $("#info").append("<tr><td>"+val.id+"</td><td>"+val.name+"</td><td>"+val.age+"</td></tr>")
                        })
                    }
                }
            )
        }
</script>
</head>
<body>
<div align="center">
    <p>学生列表</p>
    <table border="1" cellspacing="0">
        <thead>
        <tr>
            <td>id</td>
            <td>姓名</td>
            <td>年龄</td>
        </tr>
        </thead>
        <tbody id="info">
        </tbody>
    </table>
</div>
</body>
</html>
