<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="spring" 
          uri="http://www.springframework.org/tags"%>    
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Login Form</title>
</head>
<body>
    <h1>�n�J���</h1>
    <spring:bind path="command.*"> 
        <font color="red">
            <b>${status.errorMessage}</b>
        </font><br> 
    </spring:bind> 
    
    �п�J�ϥΪ̦W�ٻP�K�X�G<p> 
    <form name="loginform" 
          action="/SpringBindDemo/login.do" 
          method="post"> 
    
        <spring:bind path="command.username"> 
        �W�� <input type="text" 
                    name="${status.expression}" 
                    value="${status.value}"/><br> 
        </spring:bind> 
    
        <spring:bind path="command.password"> 
        �K�X <input type="password" 
                    name="${status.expression}" 
                    value="${status.value}"/><br> 
        </spring:bind> 
    
        <input type="submit" value="�T�w"/> 
    </form> 
    �`�N�G��J���~�|�A�^��o�ӭ������C      
</body>
</html>