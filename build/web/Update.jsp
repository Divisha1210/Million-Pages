<%-- 
    Document   : Update
    Created on : Jul 3, 2018, 7:33:14 PM
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
         <div style="border-radius: 5px;
         background-color: white;
    padding: 5px;width: 80%; float:left; margin:65px;">
             <t:form action="/update">
           <h2><u>Change password?</u></h2><br>
        <h3>   <label for="cpass">Enter your username:</label> <input type="text" name="user" size="20"/><br>
        <br><label for="cpass">  Enter your current password :</label><input type="password" name="opass" size="20"/><br>
          <br><label for="opass">Enter your new password :</label><input type="password" name="newpass" size="20"/>
          <br></h3>&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;
        <input type="submit" name="t1" value="Update"/><br><br>
      &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;
       
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <t:errors/><b><font color="red">${requestScope.msg}</font></b>
             </t:form>
</div>
    </body>
</html>
