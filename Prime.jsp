<%@page language="java"%>
<%
int n=Integer.parseInt(request.getParameter("a"));
boolean isPrime = true;
for (int d = 2; d < n; d++) {
    if (n % d == 0) {
        isPrime = false;
        break;
    }
}
if (isPrime)
    out.println("<font color='red'>"+ n + " is Prime Number");
else
    out.println("<font color='red'>"+n + " is not Prime Number");
%>

