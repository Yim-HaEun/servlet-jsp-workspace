<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="Styles.css">
</head>
<body>
<h1>ȸ������</h1>
<form action="RegisterServlet" method="post">
	<label for="mno"> ȸ����ȣ : </label>
	<input type="text" id="mno" name="mno" required><br>
	
	<label for="mname">�̸� : </label>
	<input type="text" id="mname" name="mname" required><br>

	<label for="memail">�̸��� : </label>
	<input type ="email" id="memail" name="memail" required><br>
	
	<label for="mbirth">������� : </label>
	<input type="date" id="mbirth" name="mbirth" required><br>
	<input type= "submit" value="����">



</form>

</body>
</html>