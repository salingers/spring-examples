<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<%@taglib prefix="tiles" 
            uri="http://jakarta.apache.org/struts/tags-tiles"%>     
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title><tiles:getAsString name="title"/></title>
</head>
<body>
    <table border="0" width="100%" cellspacing="5"> 
        <tr> 
            <td colspan="2">
            <tiles:insert attribute="header"/>
            </td> 
        </tr> 
        <tr> 
            <td width="140" valign="top">
            <tiles:insert attribute="menu"/>
            </td> 
            <td valign="top" align="left">
            <tiles:insert attribute="body"/>
            </td> 
        </tr> 
        <tr> 
            <td colspan="2">
            <tiles:insert attribute="footer"/>
            </td> 
        </tr> 
    </table>
</body>
</html>