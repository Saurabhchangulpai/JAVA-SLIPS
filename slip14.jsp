<%@page language="java" %>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	int lastDigit=num%10;
	int firstDigit=Integer.parseInt(String.valueOf(String.valueOf(num).charAt(0)));
	int sum=firstDigit+lastDigit;
	out.println("<font color='red' size='18'>"+sum);
%>
