<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- <form action="insert">
ID:<input type="text" name="id">
Name:<input type="text" name="name">
<button>submit</button>
</form> -->

<%-- <form:form action="save" modelAttribute="object">
Id:<form:input path="id"/><br><br>
Name:<form:input path="name"/><br><br>
<form:button>submit</form:button>
</form:form> --%>
<form action="">
num1: <input type="text" name="num1"><br>
num2: <input type="text" name="num2"><br>
<button formaction="add">add</button>
<button formaction="sub">sub</button>
<button formaction="mul">mul</button>
<button formaction="div">div</button>
</form>
</body>
</html>