<%-- 
    Document   : contact
    Created on : Jun 29, 2018, 10:03:30 AM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script type="text/javascript">
            function greeting(){
                alert("Thank You " + document.forms["f1"]["name"].value + " ! We will contact you soon!")
            }
        </script>
        <style>
             input[type=submit] {
    width: 10%;
    background-color:#4CAF50 ;
    color: white;
    padding: 5px 5px;
    margin: 4px ;
    border: none;
    border-radius: 4px;
    cursor: pointer;
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

        </style>

    </head>
    <style>
        label{
display:inline-block;
width:100px;
margin-left:30px;
text-align:left;
}
  


    </style>
    <jsp:include page="Header.jsp"/><br><br>
    <body bgcolor="antiquewhite">
        <table width="100%" height="70"/>
    <center><form name="f1" onsubmit="greeting()">
         <div style="border-radius: 5px;
         background-color:white ;
    padding: 5px;width: 70%; float:center;">
  
          &nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Enter the following details and we will contact you later.<br><br>
         <br> <label for="name">Name:</label>
    <input type="text" name="name" size="35" placeholder="Enter Name"align='left'/><br><br>
       <label for="email">e-mail:</label> 
       <input type="text" name="mail" size="35" placeholder="Enter email" align='left'/><br><br>
     <label for="msg">Message:</label>&nbsp;&nbsp;&nbsp;
     <input type="text" name="msg" size="38" placeholder="Enter Message" align='left'   
   style="height:150px"/>
    

     <br><br><input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="Reset"/>
         </div>  </form>    </center>
</table>
    <jsp:include page="Footer.jsp"/>
    </body>
    
</html>
