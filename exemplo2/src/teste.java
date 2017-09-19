
import java.util.List;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author celio manso
 */
public class teste {
    
    
    
    
    public static void main(String[] args) {
        
         Estudante   a1 = new Estudante();
        a1.setNome("joao");
        a1.setIdade(13);
        a1.setMatricula("321");
        
        
                 Estudante a2 = new Estudante();
        a2.setNome("mussa");
        a2.setIdade(22);
        a2.setMatricula("123");
        
        
        
        // Estudante d=new Estudante();
        Session e= new NewHibernateUtil().getSessionFactory().openSession();
        e.beginTransaction();
        e.save(a1);
        e.save(a2);
        e.getTransaction().commit();
        //e.close();
        new NewHibernateUtil().getSessionFactory().close();
        
     
        

               
        
        
        
        
    }
}
