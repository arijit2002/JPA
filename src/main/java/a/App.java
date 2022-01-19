package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cf= new Configuration();
    	cf=cf.configure("hibernate.cfg.xml");
    	System.out.println(cf);
    	SessionFactory sf=cf.buildSessionFactory();
    	System.out.println(sf);
    	Session ss=sf.openSession();
    	Employee e=new Employee(20, "Rupam", "Howrah");
    	Transaction tr=ss.beginTransaction();
    	ss.save(e);
    	tr.commit();
    	ss.close();
    	System.out.println("Employee Saved.... Check database");
    }
}
