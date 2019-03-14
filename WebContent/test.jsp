<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="practice.Human"%>
<%
	String title = "Welcome to Jsp World!";
	System.out.println("title: " + title);
	
	Human seho = new Human(177,75,"A");
	Human sejin = new Human();
	
	seho.setWeight(seho.getWeight()+1);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title><%=title %></title>
</head>
<body>
	<p>임세호 몸무게: <%=seho.getWeight() %>kg</p>
	<p>임세진 몸무게: <%=sejin.getWeight() %>kg</p>
</body>
</html>