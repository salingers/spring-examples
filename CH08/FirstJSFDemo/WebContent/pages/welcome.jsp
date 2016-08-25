<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>第一個JSF程式</title>
</head>
<body>
    <f:view>
        <h:outputText value="#{user.name}"/> 您好！
        <h3>歡迎使用 JavaServer Faces！</h3>
    </f:view>    
</body>
</html>