<%-- 
    Document   : Header
    Created on : Jun 26, 2018, 1:28:16 PM
    Author     : My Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="t" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>JSP Page</title>
 <style>
 body {
        margin:0;
        padding:0;
        font: bold 11px/1.5em Verdana;
}

h2 {
        font: bold 14px Verdana, Arial, Helvetica, sans-serif;
        color: #000;
        margin: 0px;
        padding: 0px 0px 0px 15px;
}

/*- Menu Tabs D--------------------------- */

    #tabsD {
      float:left;
      width:100%;
      background:#FCF3F8;
      font-size:10px;
      line-height:normal;
          border-bottom:1px solid #F4B7D6;
      }
    #tabsD ul {
        margin:0;
        padding:10px 10px 10px 50px;
        list-style:none;
      }
    #tabsD li {
      display:inline;
      margin:10px;
      padding:0;
      }
    #tabsD a {
      float:left;
      background:url("tableftD.gif") no-repeat left top;
      margin:0;
      padding:0 0 0 4px;
      text-decoration:none;
      }
    #tabsD a span {
      float:left;
      display:block;
      background:url("tabrightD.gif") no-repeat right top;
      padding:5px 5px 4px 6px;
      color:#C7377D;
      }
    /* Commented Backslash Hack hides rule from IE5-Mac \*/
    #tabsD a span {float:none;}
    /* End IE5-Mac hack */
    #tabsD a:hover span {
      color:#C7377D;
      }
    #tabsD a:hover {
      background-position:0% -42px;
      }
    #tabsD a:hover span {
      background-position:100% -42px;
      }

        #tabsD #current a {
                background-position:0% -42px;
        }
        #tabsD #current a span {
                background-position:100% -42px;
        }

p {
  text-align: center;
  margin-top:0px;

}


</style>

    
    </head>
    <body>
        <table width="100%" >
            <tr>
                <td width="1520" height="5" valign="top">
                 <%--   <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active"><a href="index.html">Home</a></li>
                        <li><a href="shop.html">Shop page</a></li>
                        <li><a href="single-product.html">Single product</a></li>
                        <li><a href="cart.html">Cart</a></li>
                        <li><a href="checkout.html">Checkout</a></li>
                        <li><a href="#">Category</a></li>
                        <li><a href="#">Others</a></li>
                        <li><a href="#">Contact</a></li>
                    </ul>
                </div>--%>
                 <div style="background-color: #ffccff" align="center" >
                        <img src="image/h1.jpg"  width="1520" height="145">
                     
                    <div id="tabsD">
                                <ul>
                                  
                                    <h2>      
                                        <li id="current"><a href="Login.jsp"><span>Home</span></a></li>
<li><a href="contact.jsp"><span>Contact Us</span></a></li>
<li><a href="about.jsp"><span>About Us</span></a></li>
<li><a href="MyAccount.jsp"><span>My Account</span></a></li>       
<li><a href="Download.jsp"><span>Download App</span></a></h2>
 </li>
                                    
                                </ul>
                      
                    </div><br>OFFER ENDS IN
<p id="demo"></p>
<script>
// Set the date we're counting down to
var countDownDate = new Date("Sep 5, 2018 15:37:25").getTime();

// Update the count down every 1 second
var x = setInterval(function() {

    // Get todays date and time
    var now = new Date().getTime();
    
    // Find the distance between now an the count down date
    var distance = countDownDate - now;
    
    // Time calculations for days, hours, minutes and seconds
   // var days = Math.floor(distance / (1000 * 60 * 60 * 24));
    var hours = Math.floor((distance % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60));
    var minutes = Math.floor((distance % (1000 * 60 * 60)) / (1000 * 60));
    var seconds = Math.floor((distance % (1000 * 60)) / 1000);
    
    // Output the result in an element with id="demo"
    document.getElementById("demo").innerHTML = hours + "h "
    + minutes + "m " + seconds + "s ";
    
    // If the count down is over, write some text 
    if (distance < 0) {
        clearInterval(x);
        document.getElementById("demo").innerHTML = "EXPIRED";
    }
}, 1000);
</script>
 

 <%--   <a href="Login.jsp">Home</a>&nbsp;&nbsp;|<a href ="contact.jsp">Contact Us</a>
    &nbsp;&nbsp;|<a href ="about.jsp">About Us</a>&nbsp;&nbsp;|
                            <a href ="Register.jsp">Register</a>&nbsp;&nbsp;|
                            <a href="MyAccount.jsp">My Account</a>&nbsp;&nbsp;|
                            <a href ="Download.jsp">Download App</a>
--%>


                    <%--    <h3> <a href="Login.jsp">Home</a>&nbsp;&nbsp;|<a href ="contact.jsp">Contact Us</a>&nbsp;&nbsp;|<a href ="about.jsp">About Us</a>&nbsp;&nbsp;|
                            <a href ="Register.jsp">Register</a>&nbsp;&nbsp;|<a href="MyAccount.jsp">My Account</a>&nbsp;&nbsp;|<a href ="Download.jsp">Download App</a>
                        </h3> --%> </div>
                </td>
            </tr>
        </table>
    </body>
</html>
