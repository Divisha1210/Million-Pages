<%-- 
    Document   : Forgot
    Created on : Jul 3, 2018, 8:09:08 PM
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
                alert( document.forms["f1"]["name"].value + " We have sent a link to your email.")
            }
        </script>
      <style>
             input[type=submit] {
    width: 30%;
    background-color:#4CAF50 ;
    color: white;
    padding: 5px 5px;
    margin: 4px ;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
input[type=reset] {
    width: 30%;
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
    <jsp:include page="Header.jsp"/><br><br>
    <body>
        <table>
    <center><form name="f1" onsubmit="greeting()">
         
          &nbsp;&nbsp;&nbsp;&nbsp;
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <div style="border-radius: 5px;
         background-color: antiquewhite;
    padding: 20px; width:500px; height:250px;">
    
         <label for="name"><h3>Enter your registered email:</label></h3>
    <input type="text" name="name" size="55" align='left'/><br><br>
    

     <br><br><input type="submit" value="Submit"/>&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="Reset"/>
         </div>
        </form>    </center>
</table>
    <jsp:include page="Footer.jsp"/>
    </body>
    
</html>
