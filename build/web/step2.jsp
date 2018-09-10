<%-- 
    Document   : step2
    Created on : Jul 1, 2018, 11:48:38 PM
    Author     : s
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="q" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    
     <style>
         
                    input[type=submit] {
    width: 20%;
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
margin-right:10px;
text-align:right;
}
    </style> 
       
    </head>
    
    <body><center>
        
            <q:form action="/pro">
        <b>STEP 2)Order Details :</b><br><br><br><br>
        
        <label name="quantity">Quantity:</label><input type="text" name="qty" size="15"><br><br>
        <label name="dt">Order Date:</label><input type="date" name="Date"  size="15" ><br><br>
      &nbsp; &nbsp;&nbsp; <label name="payment">PaymentMethod:</label>      
        <input type="checkbox" name="cod"  value="cod">Cash On Delivery<br>
        <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <input type="checkbox" name="online" value="online">Online Payment <br>
          
            <br><br><br><br>
<b>STEP 3) Checkout:<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input type="submit" name ="proceed" value="proceed"><br>
   
</q:form>
</b></center>
    </body>
</html>
