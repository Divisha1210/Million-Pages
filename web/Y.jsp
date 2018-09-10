<%-- 
    Document   : Y
    Created on : Jul 2, 2018, 12:12:53 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <jsp:include page="Header.jsp"/>
    <body background="image/rt.jpg">
        <h1>
        <p:errors/>${requestScope.msg}</h1>
    </body>
    <jsp:include page="Footer.jsp"/>
</html>
