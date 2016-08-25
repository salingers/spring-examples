<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="spring"
          uri="http://www.springframework.org/tags"%>
    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Message Tag Demo</title>
</head>
<body>
  <h1><spring:message code="welcome" arguments="Justin,Lin"/></h1>
</body>
</html>