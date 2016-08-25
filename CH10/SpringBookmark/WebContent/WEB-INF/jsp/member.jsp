<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="caterpillar" tagdir="/WEB-INF/tags" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<caterpillar:header/>

  <br> ${valid_user} 您好：<br><br>
  <form name='bm_table' action='member.do' method='post'>
  <table width='300' cellpadding='2' cellspacing='0'>
  <tr bgcolor='#cccccc'><td><strong>書籤</strong></td>
  <td><strong>刪除？</strong></td></tr>
  <c:forEach var="url" items="${urls}" >
      <tr bgcolor='#ffffff'>
          <td><a href=<c:out value="${url}"/>>
                  <c:out value="${url}"/>
              </a></td>
          <td><input type='checkbox' name='del_me' 
                     value=<c:out value="${url}"/>></td>
      </tr>
  </c:forEach>
        <tr bgcolor='#ffffff'>
          <td></td>
          <td>
            <input type='hidden' name='action' 
                   value='deleteUrl'>
            <input type='submit' value='刪除'>
          </td>
      </tr>
  </table> 
  </form>
  
<caterpillar:usermenu/>
<caterpillar:footer/> 
