<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="for" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Gear Technical Forum<br>
Answer the Query</h1><br>


<a href="screen1">home</a><br/>
		<for:form method="post" action="updatedata" modelAttribute="my1" >
		<table>
			
             <tr>
				<td>Query Id: </td>
				<td><for:input path="query_id" value="${query.query_id }" readonly="true" /></td>
				
			</tr>
             
			<tr>
				<td>Select Technology: </td>
				<td><for:input path="technology" value="${query.technology }" /></td>
				
			</tr>

			<tr>
				<td>Question:</td>
				<td><for:input path="query" value="${query.query }" /></td>
				
			</tr>

			<tr>
				<td>Question Raised by:</td>
				<td><for:input path="query_raised_by" value="${query.query_raised_by }" /></td>
			</tr>
			
			<tr>
				<td>Solution:</td>
				<td><for:textarea path="solutions" />
			</tr>
			
			<tr>
				<td>Answered by</td>
				<td><for:select path="solution_given_by" items="${select }"  /></td>
			</tr>
			
			
			<tr>
				<td><input type="submit" value="Update Query"></input></td>
			</tr>
		</table>
</for:form>
</body>
</html>