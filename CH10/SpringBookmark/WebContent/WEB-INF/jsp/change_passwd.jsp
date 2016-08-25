<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="caterpillar" tagdir="/WEB-INF/tags" %>
<caterpillar:header/>
   <br>
   <form action='member.do' method='post'>
   <table width='250' cellpadding='2' 
          cellspacing='0' bgcolor='#cccccc'>
   <tr><td>·s±K½X¡G</td>
       <td>
          <input type='password' name='new_passwd' 
                 size='16' maxlength='16'>
          <input type='hidden' name='action' 
                 value='changePasswd'>
       </td>
   </tr>
   <tr><td colspan='2' align='center'>
           <input type='submit' value='§ïÅÜ±K½X'>
   </td></tr>   
   </table>
   <br>
   </form>

<caterpillar:usermenu/>
<caterpillar:footer/>
