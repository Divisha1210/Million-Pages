/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rcpl;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author s
 */
public class UpdateBean extends org.apache.struts.action.ActionForm {

    /**
     * @return the opass
     */
    public String getOpass() {
        return opass;
    }

    /**
     * @param opass the opass to set
     */
    public void setOpass(String opass) {
        this.opass = opass;
    }

    /**
     * @return the newpass
     */
    public String getNewpass() {
        return newpass;
    }

    /**
     * @param newpass the newpass to set
     */
    public void setNewpass(String newpass) {
        this.newpass = newpass;
    }
    
    private String opass;
    private String newpass;
    
    
}
