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
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author s
 */
public class LoginAction extends org.apache.struts.action.Action {

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


        LoginBean lb=(LoginBean)form;
        String name=lb.getT1();
        String pass=lb.getT2();
        //--------------------
         Class.forName("com.mysql.jdbc.Driver");//Driver gets loaded
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tank","root","qwerty");//we get the whole address
             PreparedStatement pst=con.prepareStatement("select * from register where name=? and password=?");
             pst.setString(1,name);
              pst.setString(2,pass);
             //pst.setString(2,actress);
             //int status=pst.executeUpdate();
             ResultSet rs=pst.executeQuery();
             int flag=0;
             while(rs.next())
             {
             if (name.equals(rs.getString(1))&& pass.equals(rs.getString(3)))
             {
                 request.setAttribute("mesg", "Welcome \t" + name +"\t !");
                    SUCCESS="ok";
             }  
        //-------------------------
        
        else
        {
//         request.setAttribute("msg", "Invalid User"); 
         SUCCESS="fail";
        }
             }  
        return mapping.findForward(SUCCESS);
    }
}
