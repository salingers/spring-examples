<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=BIG5">
<title>Upload Page</title>
</head>
<body>
    <form name="uploadForm" enctype="multipart/form-data" 
          action="/FileUploadDemo/upload.do" method="POST">
        上載後檔案名稱: <input name="name" type="text"/><br>
        選擇檔案: <input name="contents" type="file"/><br>
        <input type="submit" value="Submit"/>  
    </form>
</body>
</html>