<%@ page language="java" import="java.util.*,com.Education.Bean.teacherbean,com.Education.imp.Teacherimplements"  pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'update.jsp' starting page</title>
    
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
  	<%int id = Integer.parseInt(request.getParameter("t_id"));
		Teacherimplements teimp = new Teacherimplements();
		teacherbean te = teimp.findById(id);
		 %>
	<form action="admin_update_teacher" method="post">
		<table>
		    <tr>
		    	<td><input type="number" value="<%=te.getTage() %>" name="age"></td>
		    </tr>
		    <tr>
		    	<td><input type="hidden" name='id' value="<%=te.getTid()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="hidden" name='pwd' value="<%=te.getTpassword()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="date" name='date' value="<%=te.getTdate()%>" type="date"></td>
		    </tr>
		    <tr>
		    	<td><input type="text" name='email' value="<%=te.getTemail()%>"></td>
		    </tr>
		    <tr>
		    	<td>
		    		<%if(te.getTgrender().equals("男")){ %>
		    			<input type="radio" value="男" checked="checked">男
		    			<input type="radio" value="女">女
		    		<%}else{ %>
		    			<input type="radio" value="男">男
		    			<input type="radio" value="女" checked="checked">女
		    		 <%}%>
		    	</td>
		    </tr>
		    <tr>
		    	<td><input type="text" name='phone' value="<%=te.getTphone()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="text" name='username' value="<%=te.getTusername()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="submit" value="提交"></td>
		    </tr>
	    </table>
    </form>
  </body>
</html>
