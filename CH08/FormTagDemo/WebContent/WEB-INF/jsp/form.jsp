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
    <h1>登入表單</h1>
        請輸入使用者名稱與密碼：<p> 
    <form:form>
        名稱：<form:input path="username" /><br>
        密碼：<form:password path="password" />
        <input type="submit" value="確定"/> 
    </form:form>
</body>
</html>