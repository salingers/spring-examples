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
    <h1>登入表單</h1>
    <spring:bind path="command.*"> 
        <font color="red">
            <b>${status.errorMessage}</b>
        </font><br> 
    </spring:bind> 
    
    請輸入使用者名稱與密碼：<p> 
    <form name="loginform" 
          action="/SpringBindDemo/login.do" 
          method="post"> 
    
        <spring:bind path="command.username"> 
        名稱 <input type="text" 
                    name="${status.expression}" 
                    value="${status.value}"/><br> 
        </spring:bind> 
    
        <spring:bind path="command.password"> 
        密碼 <input type="password" 
                    name="${status.expression}" 
                    value="${status.value}"/><br> 
        </spring:bind> 
    
        <input type="submit" value="確定"/> 
    </form> 
    注意：輸入錯誤會再回到這個頁面中。      
</body>
</html>