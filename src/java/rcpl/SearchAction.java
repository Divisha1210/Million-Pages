/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author s
 */
public class SearchAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        SearchBean sb=(SearchBean)form;
        String b=sb.getBook();
        String bt=sb.getSearch();
       //-----------------------------------------
       Class.forName("com.mysql.jdbc.Driver");//Driver gets loaded
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tank","root","qwerty");//we get the whole address
                    Statement stmt=con.createStatement();
                   PreparedStatement pst=con.prepareStatement("select * from books where bname=?");
                   pst.setString(1,b);
                   ResultSet rs=pst.executeQuery();
                   while(rs.next())
                    {
                        if(b.equals(rs.getString(1)))
                        {
                             request.setAttribute("msg","Book Available !");
                      return mapping.findForward("yes");
                        }
                        con.close();
                    }
                    
       //-------------------------------------------
     request.setAttribute("msgg", "Sorry ! Currently Unavailable.");
        return mapping.findForward("no");
    }
}
