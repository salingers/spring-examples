<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib prefix="form" 
           uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Login Form</title>
</head>
<body>
    <h1>�n�J���</h1>
        �п�J�ϥΪ̦W�ٻP�K�X�G<p> 
    <form:form>
        �W�١G<form:input path="username" /><br>
        �K�X�G<form:password path="password" />
        <input type="submit" value="�T�w"/> 
    </form:form>
</body>
</html>