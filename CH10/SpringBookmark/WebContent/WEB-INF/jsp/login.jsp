<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="caterpillar" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="spring" 
                 uri="http://www.springframework.org/tags"%>
                 
<caterpillar:header/>
<caterpillar:site_info/>
  <a href='register.do'>還不是會員？</a><p>
  <form method='POST' action='login.do'>
    <spring:bind path="command.*"> 
        <font color="red">
            <b>${status.errorMessage}</b>
        </font><br> 
    </spring:bind>
  <table bgcolor='#cccccc'>
   <tr>
     <td colspan='2'>會員登入</td>
   <tr>
     <td>名稱：</td>
     <td>
          <spring:bind path='command.username'>
          <input type='text' name='${status.expression}' 
                value='${status.value}'>
          </spring:bind>
     </td>
   </tr>
   <tr>
     <td>密碼：</td> 
     <td>
         <spring:bind path='command.passwd'>
         <input type='password' 
                name='${status.expression}'>
         </spring:bind>
     </td>
   </tr>
   <tr>
     <td colspan='2' align='center'>
     <input type='submit' value='登入'></td></tr>
   <tr>
     <td colspan='2'><a href='forgot.do'>忘記密碼？</a></td>
   </tr>
 </table></form>
<caterpillar:footer/>
