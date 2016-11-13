/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sga;

import java.util.Iterator;
import org.hibernate.Session;
import pojos.Tipoacidente;

/**
 *
 * @author v1n1c
 */
public class Sga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tipoacidente tipoacidente = new Tipoacidente();
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        Iterator i = sessao.createQuery("from Tipoacidente").list().iterator();
        
        while(i.hasNext()){
            tipoacidente = (Tipoacidente) i.next();
            System.out.printf("%d\t%s\n", tipoacidente.getIdTipoacidente(),tipoacidente.getTipoAcidente());
        }
        sessao.close();
    }   
}
