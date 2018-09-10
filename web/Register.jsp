<%-- 
    Document   : Register
    Created on : Jun 27, 2018, 12:56:15 PM
    Author     : My Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="q" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <%--<script type="text/javascript">
            function greeting(){
                alert( " You have successfully registered on MILLION PAGES !")
            }
        </script>--%>
<style>
            input[type=submit] {
    width: 10%;
    background-color:#4CAF50 ;
    color: white;
    padding: 5px 5px;
    margin: 4px ;
    border: none;
    border-radius: 4px;
    cursor:pointer;
}
input[type=reset] {
    width: 10%;
    background-color:#4CAF50 ;
    color: white;
    padding: 5px 5px;
    margin: 4px ;
    border: none;
    border-radius: 4px;
    cursor: pointer;

}
     
        label{
display:inline-block;
width:200px;
margin-right:30px;
text-align:right;
}
    </style>
</head>    <jsp:include page="Header.jsp"/>
    <body bgcolor="antiquewhite">
    <center>
    <q:form action="/register">
        <table width='100%' height='100'> <br><br><div style="border-radius: 5px;
         background-color:white ;
    padding: 5px;width: 70%; float:center;">
  
  &nbsp;&nbsp;&nbsp;&nbsp;
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<h1>REGISTER</h1> <br>
  <h3>   <label for="name">Name:</label> <input type="text" name="name" size="35" align='left'/><br><br>
       <label for="email">e-mail:</label> <input type="text" name="mail" size="35" align='left'/><br><br>
     <label for="pass">Password:</label><input type="password" name="msg" size="35" align='left'/>
     <br><br>
    <label for="rpass">Re-enter Password:</label><input type="password" name="remsg" size="35" align='left'/>   
    <br><br>
    <input type='submit' name="t" value="Register"/>&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="reset" value="Reset"/><br><br>
    <font color="red">    <q:errors/>${requestScope.msg}</font>
  </h3></div>  </table>
        </q:form>  
    </center>
        <jsp:include page="Footer.jsp"/>
    </body>
</html>
