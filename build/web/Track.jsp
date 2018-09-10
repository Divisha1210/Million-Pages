<%-- 
    Document   : Track
    Created on : Jul 3, 2018, 7:33:29 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
                <style>
            input[type=submit] {
    width: 100%;
    background-color:#4CAF50 ;
    color: white;
    padding: 14px 20px;
    margin: 8px ;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
label{
display:inline-block;
width:280px;
margin-left:60px;
text-align:left;
}
input[type=submit] {
    width: 30%;
    background-color:#4CAF50 ;
    color: white;
    padding: 10px 10px;
    margin: 5px ;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

        </style>

    </head>
    <body bgcolor="antiquewhite">
        <p:form action="/track">
        <div style="border-radius: 5px;
         background-color:white ;
    padding: 5px;width: 70%; float:right; margin:65px;">
  
    <h2><u> Track your order?</u> </h2><br>
   <h3>  <br><br> <label for="oid">  Enter your Order Id:</label>
       <input type="number" name="oid" size="20"/></b>
        <br><br>&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;<input type="submit" name="Track" value="Track"/><br><br>
        <p:errors/><font color="red">&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;${requestScope.trm}<br><br></font>
   </h3>
</div>
        </p:form>
    </body>
</html>
