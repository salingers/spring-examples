<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>JSTL And Spring</title>
</head>
<body>
    <c:choose>
        <c:when test="${age >= 18}">
            <h1>嗨, <c:out value="${name}"/> ！</h1>
        </c:when>
        <c:otherwise>
            <h1>未滿十八歲喔！</h1>
        </c:otherwise>
    </c:choose>
</body>
</html>