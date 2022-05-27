<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.List, java.util.ArrayList, model.dao.dto.TodoDTO"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Todo List</title>
</head>
<body>
	<%
		List<TodoDTO> todoList = (List) request.getAttribute("todoList");
	%>

	<% for(TodoDTO todo: todoList){  %>
		<%=todo.getQuizid() %>
                <%=todo.getIssue() %> 
                <%=todo.getGenre() %>
                <%=todo.getTitle() %>
                <%=todo.getLevel() %>
                <%=todo.getOrderno() %>
                <%=todo.getImg1() %>
                <%=todo.getNote1() %>
                <%=todo.getNote2() %>
                <%=todo.getNote3() %>
                <%=todo.getNote4() %>
	<%  } %>
</body>
</html>