<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="caterpillar" tagdir="/WEB-INF/tags" %>

<caterpillar:header/>
   <br>
   <form action='forgot.do' method='post'>
   <table width='250' cellpadding='2' 
          cellspacing='0' bgcolor='#cccccc'>
   <tr><td>輸入郵件地址：</td>
       <td><input type='text' name='email' 
                  size='16' maxlength='100'></td>
   </tr>
   <tr><td colspan='2' align='center'>
           <input type='submit' value="寄出密碼">
   </td></tr>
   </table>
   <br>
<caterpillar:footer/>
