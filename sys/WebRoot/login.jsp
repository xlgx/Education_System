<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<title>教务系统</title>
	</head>
<body>
    <div class="container">
        <h2>欢迎使用教务统</h2>
        <form method="post" action="${pageContext.request.contextPath }/login">
            <input type="text" name="username" placeholder="请输入用户名" id = "user" require><br />
            <input type="password" name="password" placeholder="请输入密码" id = "pwd" require><br />
            <input type="radio" name="radio" value="学生" checked="checked">学生
            <input type="radio" name="radio" value="教师">教师
            <input type="radio" name="radio" value="管理员">管理员<br>
            <input type="submit" value="登录" name="submie">
            <input type="button" name="register" value="注册" onclick="window.location.href='register.jsp'" />
    </div>
    </form>
</body>
</html>
