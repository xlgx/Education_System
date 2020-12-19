<%@ page language="java" contentType="text/html; charset=utf-8"%>
<html>
	<head>
		<title>注册界面</title>
	</head>
<body>
        <h2>学生注册</h2>
       <form method="post" action="register">
            <input type="text" name="username" placeholder="请输入用户名" required> <br>
            <input type="password" name="password" placeholder="请输入密码" required id="pwd"> <br>
            <input type="password" name="confirm_password" placeholder="再次输入密码" required id="conpwd"> <br>
            <input type="radio" name="gender" value="男" checked="checked">男
            <input type="radio" name="gender" value="女">女<br>
            <input type="number" min="0" max="120" name="age" required><br>
            <input type='text' name='phone' pattern='1[3|4|5|8][0-9][0-9]{8}$' title='手机号码是11位数' placeholder="请输入电话" required><br>
            <input type="date" name="date"><br>
            <input type="email" name="email" placeholder="请输入电子邮箱" required> <br>
            <input type="submit" value="确定">
            <input type="reset" value="清空" name="reset"> <br>
            <input type="button" name="register" value="返回登陆" onclick="window.location.href='login.jsp'" />
            <script type="text/javascript">
            	if(document.getElementById("pwd")!=document.getElementById("conpwd")){
            		alert("两次密码不同");
            	}
            </script>
       </form>
</body>
</html>
