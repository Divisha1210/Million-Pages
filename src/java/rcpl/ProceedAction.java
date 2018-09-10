/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import static java.util.stream.Collectors.mapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static javax.swing.UIManager.getInt;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author s
 */
public class ProceedAction extends org.apache.struts.action.Action {

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
           
        ProceedBean pb=(ProceedBean)form;
        String bt=pb.getProceed();
        String q=pb.getQty();
        String c=pb.getCod();
        
        
        if(bt.equals("proceed"))
           //----------------------------------           
                   Class.forName("com.mysql.jdbc.Driver");//Driver gets loaded
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tank","root","qwerty");//we get the whole address
                    PreparedStatement pst=con.prepareStatement("INSERT INTO mine(Qty,Pay) values (?,?)",Statement.RETURN_GENERATED_KEYS);
                            
                        
                    pst.setString(1,q);
                    pst.setString(2,c);
                    int status=pst.executeUpdate();
                    
                    int oid =0;
                    ResultSet rs = pst.getGeneratedKeys();
int generatedKey = 0;
if (rs.next()) {
    oid = rs.getInt(1);
}

                    if(status>0)
                    {
                      //PreparedStatement pst1=con.prepareStatement("select * from mine");
                       //ResultSet rs=pst.executeQuery();
                       // oid=getInt(1);
                       //oid= LAST_INSERT_ID();
                  request.setAttribute("i",oid);
                  SUCCESS="p";
                    }
                    else
                    {
                        //request.setAttribute("j","Registered Unsuccessfully !");
                        SUCCESS="f";
                    }
                    con.close();

        
                    //-------------------------
                         return mapping.findForward(SUCCESS);
                    }
           //con.close();  
             }
       

        
              
     
    
