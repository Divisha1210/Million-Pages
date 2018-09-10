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
public class SearchBean extends org.apache.struts.action.ActionForm {

    /**
     * @return the book
     */
    public String getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(String book) {
        this.book = book;
    }

    /**
     * @return the Search
     */
    public String getSearch() {
        return Search;
    }

    /**
     * @param Search the Search to set
     */
    public void setSearch(String Search) {
        this.Search = Search;
    }
    
    private String Search;
    private String book;
}
