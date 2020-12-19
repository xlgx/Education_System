<%@ page language="java" import="java.util.*" import="com.Education.Bean.teacherbean" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'lookMessage.jsp' starting page</title>
    
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
    <%List list = (List)session.getAttribute("list_teacher"); %>
    <table>
    <%for(int i = 0;i < list.size();i++){
    	teacherbean te = (teacherbean)list.get(i); %>
    	
    	<tr>
    		<td><%=te.getTusername() %></td>
    		<td><%=te.getTage() %></td>
    		<td><%=te.getTemail() %></td>
    		<td><a href="javascript:del();">删除</a></td>
    		<td><a href="admin_teacher/admin_update_teacher.jsp?t_id=<%=te.getTid()%>">修改</a></td>
    	</tr>
    	<script type="text/javascript">
    	 	function del() {
			  if (confirm('确定删除？')) {
			    window.location.href = 'admin_delete_teacher?t_id=<%=te.getTid()%>';
			  }
			}
    	 </script>
    	<%}
    	 %>
    	 </table>
    	 
    	 
  </body>
</html>
