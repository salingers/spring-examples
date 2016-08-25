<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="c" 
          uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>JSP Page</title>
</head>
<body>
    <spring:bind path="command.*">
        <font color="red">
            <c:out value="${status.errorMessage}"/>
        </font>
    </spring:bind>
    
    <form name="weekForm" 
          action="/TransFormTagDemo/weekForm.do" 
          method="POST">
        <spring:bind path="command.weekNumber">
            <select name="weekNumber">
                <c:forEach var="weekNumber" 
                           items="${weekNumbers}" >
                    <spring:transform value="${weekNumber}" 
                                          var="weekName"/>
                    <c:choose>
                    
                    <c:when test="${status.value == weekName}">
                    <option value="<c:out value="${weekName}"/>" 
                                        selected>
                    </c:when>
                    <c:otherwise> 
                    <option value="<c:out value="${weekName}"/>">
                    </c:otherwise>
                    
                    </c:choose>
                        <c:out value="${weekName}"/>
                    </option>     
                </c:forEach>
            </select>
        </spring:bind>
        <input type="submit" value="Submit"/>  
    </form>
</body>
</html>