<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>第一個JSF程式</title>
</head>
<body>
    <f:view>
        <h:form>
            <h3>請輸入您的名稱</h3>
            名稱: <h:inputText value="#{user.name}"/><p>
            <h:commandButton value="送出" action="login"/>
        </h:form>
    </f:view>
</body>
</html>
