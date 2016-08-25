<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Login Form</title>
</head>
<body>
    <h1>登入表單</h1>
     請輸入使用者名稱與密碼：<p> 
    <form name="loginform" 
          action="/SimpleFormDemo/login.do" method="POST"> 
    名稱 <input type="text" name="username"/><br> 
    密碼 <input type="password" name="password"/><br> 
        <input type="submit" value="確定"/> 
    </form> 
    注意：輸入錯誤會再回到這個頁面中。        

</body>
</html>