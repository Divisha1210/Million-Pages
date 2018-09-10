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
public class TrackAction extends org.apache.struts.action.Action {

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
        TrackBean tb = (TrackBean)form;
        int oid=tb.getOid();
       // String tr=tb.getTrack();
        //if(tr.equals("Track"))
        
             //--------------------
         Class.forName("com.mysql.jdbc.Driver");//Driver gets loaded
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tank","root","qwerty");//we get the whole address
             PreparedStatement pst=con.prepareStatement("select * from track where oid=?");
             pst.setInt(1,oid);
              //pst.setString(2,pass);
             //pst.setString(2,actress);
             //int status=pst.executeUpdate();
             ResultSet rs=pst.executeQuery();
             //int flag=0;
            
             String status;
             while(rs.next())
             {
             if (oid==rs.getInt(1))
             {  
                 status=rs.getString(2);
                 request.setAttribute("trm", "Your Order Status :\t" + status+"\t.");
                    SUCCESS="trs";
            //        flag=1;
              //      break;
             }  
             
        //-------------------------
        
        else
        {
//         request.setAttribute("msg", "Invalid User"); 
         SUCCESS="trf";
        }
             } 
            //-----------------------
        
        return mapping.findForward(SUCCESS);
    }
}
