<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="caterpillar" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="spring" 
                 uri="http://www.springframework.org/tags"%>

<caterpillar:header/>
    <spring:bind path="command.*"> 
        <font color="red">
            <b>${status.errorMessage}</b>
        </font><br> 
    </spring:bind>
 <form method='post' action='register.do'>
 <table bgcolor=#cccccc>
   <tr>
     <td>�l���}�G</td>    
     <td>
         <spring:bind path='command.email'>
         <input type='text' name='${status.expression}' 
                    value='${status.value}' size='30' 
                    maxlength='100'>
                    </spring:bind>
     </td>
   </tr>
   <tr>
     <td>�W�١]�̤j16�r���^�G</td>
     <td valign='top'>
         <spring:bind path='command.username'>
         <input type='text' name='${status.expression}' 
                             value='${status.value}'
                             size='16' maxlength='16'>
         </spring:bind>                             
     </td>
   </tr>
   <tr>
     <td>�K�X�]6��16�r���^�G</td>
     <td valign='top'>
         <spring:bind path='command.passwd'>
         <input type='password' name='${status.expression}'
                     size='16' maxlength='16'>
         </spring:bind>
     </td>
   </tr>
   <tr>
     <td>�T�{�K�X�G</td>
     <td>
         <spring:bind path='command.passwd2'>
         <input type='password' name='${status.expression}' 
                size='16' maxlength='16'>
         </spring:bind> 
     </td>
   </tr>
   <tr>
     <td colspan='2' align='center'>
     <input type='submit' value='���U'></td></tr>
 </table></form>
<caterpillar:footer/>
