<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.0//EN" "http://www.w3.org/TR/REC-html40/strict.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
       <link rel="stylesheet" href="./css/menu.css">
    </head>
    <body>
	     <div class="nav">
	    	<div style="background: #f0ff93 ;margin-top:30px ">
		    	<table border="1px" width="100%" cellspacing="0">
		    		<tr>
		    			<th>学生管理</th>
		    		</tr>
		    		<tr>
		    			<td>
			    			<li><a href="lookStudentMessage">查看学生信息</a></li>
			    			<li><a href="admin_student/admin_add_student.jsp">增加学生</a></li>
		    			</td>
		    		</tr>
		    	</table>
	    	</div>
	    	
		    <div style="background: #f0ff93 ;margin-top:30px ">
		    	<table border="1px" width="100%" cellspacing="0">
		    		<tr>
		    			<th>教师管理</th>
		    		</tr>
		    		<tr>
		    			<td>
			    			<li><a href="lookTeacherMessage">查看教师信息</a></li>
			    			<li><a href="admin_teacher/admin_add_teacher.jsp">增加教师</a></li>
		    			</td>
		    		</tr>
		    	</table>
		    </div>
		    
		    <div style="background: #f0ff93 ;margin-top:30px ">
		    	<table border="1px" width="100%" cellspacing="0">
		    		<tr>
		    			<th>操作管理</th>
		    		</tr>
		    		<tr>
		    			<td>
			    			<li><a href="login.jsp" onclick="return confirm('是否要退出登录')">退出登录</a></li>
		    			</td>
		    		</tr>
		    	</table>
		    </div>
		</div>
   	</body>
</html>
