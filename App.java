package com.ProjectAssignment.Movies1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class App 
{
	
	
    public static void main( String[] args )
    {
    	 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
         Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
         SessionFactory factory=meta.getSessionFactoryBuilder().build();
         Session session=factory.openSession();
         Transaction t=session.beginTransaction();
         System.out.println("Session Created");
         
         ActionMovies am=new ActionMovies();
         am.setName("John Wick");
         am.setRating(7.4);
         am.setType("Action");
         am.setYear(2014);
         
        // session.save(am);
         
         System.out.println("Saved Successfull in Database Movies1");
         System.out.println();
         am.Genre();
         System.out.println();
         am.Top5();
         System.out.println();
         
         HorrorMovies hr=new HorrorMovies();
         hr.setName("The Conjuring");
         hr.setRating(7.5);
         hr.setType("Horror");
         hr.setYear(2013);
         
        // session.save(hr);
         
         System.out.println("Saved Successfull in Database Movies1");
         System.out.println();
         hr.Genre();
         System.out.println();
         hr.Top5();
         System.out.println();
         
         SciFiMovies sfm=new SciFiMovies();
         sfm.setName("The Matrix");
         sfm.setRating(8.5);
         sfm.setType("Sci-fi");
         sfm.setYear(1999);
         
        // session.save(sfm);
         
         System.out.println("Saved Successfull in Database Movies1");
         System.out.println();
         sfm.Genre();
         System.out.println();
         sfm.Top5();
         System.out.println();
         
       MarathiMovies mm=new MarathiMovies();
         mm.setName("Natsamrat");
         mm.setRating(8.8);
         mm.setType("Drama");
         mm.setYear(2016);
         
        // session.save(mm);
         
         System.out.println("Saved Successfull in Database Movies1");
         System.out.println();
         mm.Genre();
         System.out.println();
         mm.Top5();
         System.out.println();
         
         SouthIndianMovies sim=new SouthIndianMovies();
         sim.setName("Asuran");
         sim.setRating(8.5);
         sim.setType("Action");
         sim.setYear(2019);
         
        // session.save(sim);
         
         System.out.println("Saved Successfull in Database Movies1");
         System.out.println();
         sim.Genre();
         System.out.println();
         sim.Top5();
         System.out.println();
         
         
         
        
         
         
         
         
         t.commit();
         session.close();
         
         
    }
}
