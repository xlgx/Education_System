<%@ page language="java" import="java.util.*,com.Education.Bean.studentbean,com.Education.imp.Studentimplements"  pageEncoding="utf-8"%>
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
  	<%int id = Integer.parseInt(request.getParameter("s_id"));
		Studentimplements stimp = new Studentimplements();
		studentbean st = stimp.findById(id);
		 System.out.print(st);%>
	<form action="admin_update_student" method="post">
		<table>
		    <tr>
		    	<td><input type="number" value="<%=st.getSage() %>" name="age"></td>
		    </tr>
		    <tr>
		    	<td><input type="hidden" name='id' value="<%=st.getSid()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="hidden" name='pwd' value="<%=st.getSpassword()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="date" name='date' value="<%=st.getSdate()%>" type="date"></td>
		    </tr>
		    <tr>
		    	<td><input type="text" name='email' value="<%=st.getSemail()%>"></td>
		    </tr>
		    <tr>
		    	<td>
		    		<%if(st.getSgrender().equals("男")){ %>
		    			<input type="radio" value="男" checked="checked">男
		    			<input type="radio" value="女">女
		    		<%}else{ %>
		    			<input type="radio" value="男">男
		    			<input type="radio" value="女" checked="checked">女
		    		 <%}%>
		    	</td>
		    </tr>
		    <tr>
		    	<td><input type="text" name='phone' value="<%=st.getSphone()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="text" name='username' value="<%=st.getSusername()%>"></td>
		    </tr>
		    <tr>
		    	<td><input type="submit" value="提交"></td>
		    </tr>
	    </table>
    </form>
  </body>
</html>
