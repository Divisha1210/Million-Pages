<%-- 
    Document   : Body
    Created on : Jun 26, 2018, 1:27:44 PM
    Author     : My Dell
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
    width: 20%;
    background-color:#4CAF50 ;
    color: white;
    padding: 5px 5px;
    margin: 4px ;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}
p{
    background-color: #ffccff;
}
</style>
    </head>
    <body>
        <%--  <h1><font color="white"><marquee>Offers</marquee><br><br> --%>
        <table width="1262" >
            <tr>
                <td width="1262"  height="470" valign="top"> 
                           <div align ="left">
                               <p:form action="/search">
                                  
                                <input type="text" placeholder="Enter the name of the book"  name="book" size="80"/>&nbsp;&nbsp;
                               <input type="submit" name="Search" value="Search"/>
                               &nbsp;<b><font color="red"><p:errors/>${requestScope.msg}</b>   </p:form></font>
                 <%--     <h1> <%String name= (String)request.getAttribute("msg");
        out.println(name);
        %></h1>--%>
                <h3> </h3>
                            <img src ="image/qwerty.png" width="1250" height="370"/>
                        </div> 
                </td>
            
                
            </tr>
        </table>
        </font></h1>
    </body>
</html>
