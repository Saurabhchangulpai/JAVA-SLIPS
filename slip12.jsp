<%@ page language="java" %>
<%
	int num=Integer.parseInt(request.getParameter("num"));
	out.println("Number is ="+num);
	int sum=0;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			sum+=i;
		}
	}
	out.println("<br>"+sum+" is sum");
	if(sum==num)
	{
		out.println("<br>"+num+" is perfect number");
	}
	else	
		out.println("<br>"+num+" is not perfect number");

%>
