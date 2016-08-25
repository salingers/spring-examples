<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="caterpillar" tagdir="/WEB-INF/tags" %>
<caterpillar:header/>

<form name='bm_table' action='member.do' method='post'>
<table width='300' cellpadding='2' 
       cellspacing='0' bgcolor='#cccccc'>
<tr><td>新書籤：</td>
    <td><input type='text' 
               name='new_url'  value='http://'
               size='30' maxlength='255'>
    </td>
</tr>
<tr><td colspan='2' align='center'>
<input type='hidden' name='action' value='addUrl'>
<input type='submit' value='新增書籤'></td></tr>
</table>
</form>

<caterpillar:usermenu/>
<caterpillar:footer/>
