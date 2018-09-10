<%-- 
    Document   : Menu
    Created on : Jun 26, 2018, 1:28:51 PM
    Author     : My Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib uri="http://struts.apache.org/tags-html" prefix="p"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>    body {
        font-family: Verdana, Arial, Helvetica, sans-serif;
        margin: 0;
        font-size: 80%;
        font-weight: bold;
        background: #F3FAFF;
        }

ul {
        list-style: none;
        margin: 0;
        padding: 0;
        }

/* =-=-=-=-=-=-=-[Menu Three]-=-=-=-=-=-=-=- */

#menu3 {
        width: 200px;
        border: 1px solid #ccc;
        margin: 10px;
        }

#menu3 li a {
          height: 32px;
          voice-family: "\"}\"";
          voice-family: inherit;
          height: 24px;
        text-decoration: none;
        }

#menu3 li a:link, #menu3 li a:visited {
        color: #888;
        display: block;
        background: url(image/menu13.gif);
        padding: 8px 0 0 30px;
        }

#menu3 li a:hover, #menu3 li #current, #menu3 li a:active {
        color: #283A50;
        background: url(image/menu13.gif) 0 -32px;
        padding: 8px 0 0 30px;
        }
-->
</style>

        </head>
  




       <body> <h4> ${requestScope.mesg}</h4>
           <div id="menu3">
                        <ul>
                               <!-- CSS Tabs -->
<li><p:link action="/log1">Academics</p:link></li>
<li><p:link action="/log2">Action & Adventure</p:link></li>
<li><p:link action="/log2">Biographies</p:link></li>
<li><p:link action="/log2">Business & Investment</p:link></li>
<li><p:link action="/log2">Crime Mystery</p:link></li>
<li><p:link action="/log2">Entrance Exam</p:link></li>
<li><p:link action="/log2">Action & Adventure</p:link></li>

                      <li>   <a href="hp">History & Politics</a></li>
                      <li>  <a href="lf">Literature & Fiction</a></li>
                        </ul>
                </div>
           <%--     <table width="250" background="image/rt.jpg">
            <tr>
                <td width="250" height="470" valign="top">
                    
                    <h2>       <u>Categories</u></h2><br>
                       
                     <h3>  p:lk action="/log1">Academics</p:link>
                        <br>
                         <p:link action="/log2">Action & Adventure</p:link>
                         <br>
                          <p:link action="/log3">Biographies</p:link>
                        <br>
                       <p:link action="/log4">Business & Investment</p:link></li>
                         <br>
                          <p:link action="/log5">Crime,Thriller & Mystery</p:link></li>
                        <br>
                         <p:link action="/log6">Entrance Exam Preparations</p:link></li>
                         <br>
                          <a href="cb">Children's Books</a></li><br>
                         <a href="hp">History & Politics</a></li><br>
                       <a href="lf">Literature & Fiction</a></li><br>
                         <a href="sg">Sports & Games</a></li><br>
                         <a href="ci">Computing & Internet</a></li><br>
                         <a href="rp">Religion & Philosophy</a></li><br>
                         <a href="hl">Home & Lifestyle</a></li><br>
                         </font>
                         
                
                    </h3>    
                </td>
            </tr>
        </table> --%>
    </body>
</html>
