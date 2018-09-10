<%-- 
    Document   : Login
    Created on : Jun 28, 2018, 9:07:04 AM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
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

        </style>
     
    </head>
   
    <jsp:include page="Header.jsp"/>
    
    <body bgcolor="antiquewhite">
    
            
  <!-- Set Right Div As your requirement -->

 
        <div style="float:left; width:80%; height:50px;">
  <!-- Set Left Div As your requirement -->
  <img src ="image/qwerty.png" width="1060" height="470"/>
        </div>
<div style="float:left; width:20%;margin-left:1200px; height:20px; ">
<t:form action="/log" method="post" >
    <div style="border-radius: 5px;
         background-color: white;
    padding: 20px;">
        <table>
          <h3>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Login to Million Pages<br><br>
                Username :  <t:text property="t1" /><br><br>
                Password :&nbsp; <t:password property="t2" /><br></h3>
                <input type="checkbox" name="rem"  value="rem">Remember me on this device<br><br>
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                <div class="submit"><t:submit value="Login" /></div><br><br>
                <a href="Forgot.jsp">Forgot Password?</a><br>
                New to Million Pages?<a href="Register.jsp">Register</a>
    </div>
                 <h3>   <font color="red">
                     <t:errors/>${requestScope.msg}</font></h3>
        </table>
</t:form>
    
    

      
 
    </body>
    
    <jsp:include page="Footer.jsp"/>
    
</html>
