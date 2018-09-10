<%-- 
    Document   : Buy
    Created on : Jul 1, 2018, 2:18:01 PM
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
                alert( document.forms["f2"]["name"].value + "! Your Address is saved.")
            }
        </script>
                <style>

        label{
display:inline-block;
width:200px;
margin-right:30px;
text-align:right;
}
    </style>
 
    </head>
    
    <body>
        <jsp:include page="Header.jsp"/>
         <iframe src="step1.html" style="position:absolute;top:30%;left:0;width:50%;height:70%;"></iframe>
<iframe src="step2.jsp" style="position:absolute;top:30%;left:50%;width:50%;height:70%;"></iframe>




 <%--      <form name="f2" onsubmit="greeting()"> 
           <b>STEP 1)Add an address for Delivery:</b><br>
      <label for="name">Name:</label> <input type="text" name="name" size="30"/><br><br>
       <label for="name">Phone:</label>  <input type="text" name="ph" size="30"/><br><br>
        <label for="name">Pin Code:</label> <input type="text" name="pin" size="30"/><br><br>
        <label for="name">Locality:</label> <input type="text" name="loc" size="30"/><br><br>
        <label for="name">Address:</label> <input type="text" name="add" size="30"/><br><br>
        <label for="name">City/District/Town:</label> <input type="text" name="city" size="30"/><br><br>
       <label for="name">State:</label>  <input type="text" name="state" size="30"/><br><br>
        <label for="name">Landmark:</label> <input type="text" name="landmark" size="30"/><br><br>
        <label for="name"> Alternate Phone:</label>&nbsp;<input type="text" name="ap" size="30"/><br><br>
        <label for="name">Address Type:</label><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="home" value="home">Home<br>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="office" value="office">Office<br><br><br>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="submit" value="SAVE AND DELIVER HERE"/>&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="reset" value="RESET"/>
        <br><br><br><br> 
       </form>
        <b>STEP 2)Order Details :</b><br>
        
        <label name="quantity">Quantity:</label><input type="text" name="qty" size="15"><br><br>
        <label name="dt">Order Date:</label><input type="date" name="Date" ><br><br>
       <%-- <label name="payment">Payment Method:</label><input type="checkbox" name="cod" value="cod">Cash On Delivery<br>
        <input type="checkbox" name="online" value="online">Online Payment <br>--%>
       
<br><br>
        
    </body>
    <jsp:include page="Footer.jsp"/>
</html>
