<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  <jsp:include page="../menu.jsp" />
   <form method="post" action="admin_add_teacher">
            <input type="text" name="username" placeholder="请输入用户名" id="username" required> <br>
            <input type="hidden" name="password" placeholder="请输入密码" id="pwd" requird>
            <input type="radio" name="gender" value="男" checked="checked">男
            <input type="radio" name="gender" value="女">女<br>
            <input type="number" min="0" max="120" name="age" required><br>
            <input type='text' name='phone' pattern='1[3|4|5|8][0-9][0-9]{8}$' title='手机号码是11位数' placeholder="请输入电话" required><br>
            <input type="date" name="date"><br>
            <input type="email" name="email" placeholder="请输入电子邮箱" required> <br>
            <input type="submit" value="确定">
            <input type="reset" value="清空" name="reset"> <br>
            <script type="text/javascript">
            	document.getElementById("pwd").value = document.getElementById("username");
            </script>
       </form>
  </body>
</html>
