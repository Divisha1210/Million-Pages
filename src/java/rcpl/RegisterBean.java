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
public class RegisterBean extends org.apache.struts.action.ActionForm {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * @param mail the mail to set
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * @return the msg
     */
    public String getMsg() {
        return msg;
    }

    /**
     * @param msg the msg to set
     */
    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * @return the remsg
     */
    public String getRemsg() {
        return remsg;
    }

    /**
     * @param remsg the remsg to set
     */
    public void setRemsg(String remsg) {
        this.remsg = remsg;
    }

    /**
     * @return the t
     */
    public String getT() {
        return t;
    }

    /**
     * @param t the t to set
     */
    public void setT(String t) {
        this.t = t;
    }
    
    private String t;
     private String name;
      private String mail;
       private String msg;
        private String remsg;
    
}
