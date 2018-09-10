/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author s
 */
public class UpdateAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static  String SUCCESS = "success";

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
        
        UpdateBean ub=(UpdateBean)form;
        String o=ub.getOpass();
        String n=ub.getNewpass();
        //-------------
        Class.forName("com.mysql.jdbc.Driver");//Driver gets loaded
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tank","root","qwerty");//we get the whole address
                    PreparedStatement pst=con.prepareStatement("update register set password=? where password=?");
                    pst.setString(1,n);
                    pst.setString(2,o);
                    int status=pst.executeUpdate();
                    if(status>0)
                    {
                        request.setAttribute("msg", "Changed Successfully!");
                        SUCCESS="u";
                    }
                    else
                    {
                        request.setAttribute("msg1", "Please try again!");
                    }
                    con.close();
        
        //-------------
        
        return mapping.findForward(SUCCESS);
    }
}
