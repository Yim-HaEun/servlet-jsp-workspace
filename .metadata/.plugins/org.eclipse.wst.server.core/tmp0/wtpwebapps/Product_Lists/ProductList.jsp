<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="java.util.ArrayList" %>
<%@page import="com.kh.product.Product" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ǰ���</title>
</head>
<body>
	<h1>��ǰ���</h1>
	<ul>
	<%
		//��ǰ����� ArrayList�� ����
		//ArrayList<Product> products =new ArrayList<>();
		//products.add(new Product(1,"��Ʈ��","������ǰ",899.99,10));
		//products.add(new Product(2,"�����","������ǰ",799.99,10));
		
		ArrayList<Product> products = (ArrayList<Product>)request.getAttribute("products");
		//for ���� Ȱ���ؼ� ��ǰ����� �ݺ��ؼ� ǥ���� �� ����
		for(Product p:products){
		%>
			<li><%= p.getProductName() %>�� ����<%=p.getPrice() %><li>
			<% 
			
		}
	%>
	</ul>

</body>
</html>