<%-- 
    Document   : N
    Created on : Jul 2, 2018, 12:13:15 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="Header.jsp"/>
    <body background="image/rt.jpg">
        
        <h1><font color="red">
            <%
                String name= (String)request.getAttribute("msgg");
        out.println(name);
        %></font>
        </h1>

    </body>
    <jsp:include page="Footer.jsp"/>
</html>
