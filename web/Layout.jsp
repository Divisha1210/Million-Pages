<%-- 
    Document   : Layout
    Created on : Jun 26, 2018, 1:28:36 PM
    Author     : My Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@taglib  uri="http://struts.apache.org/tags-tiles" prefix="p"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table width="100%">
            <tr>
                <td  height="11" colspan="3" valign="top">
                    <p:insert attribute="HEADER"></p:insert> 
                </td>
                
            </tr>
            <tr>
                <td width="250" height="470" valign="top">
                 <p:insert attribute="MENU"></p:insert>    
                </td>
                <td width="1262" height="470" valign="top">
                 <p:insert attribute="BODY"></p:insert>    
                </td>
            </tr>
            <tr>
                <td  height="60" colspan="3" valign="top">
                <p:insert attribute="FOOTER"></p:insert>     
                </td>
            </tr>
        </table>
    </body>
</html>
