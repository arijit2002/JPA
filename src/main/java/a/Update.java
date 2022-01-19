package a;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update
{
    public static void main( String[] args )
    {
    	Configuration cf= new Configuration();
    	cf=cf.configure("hibernate.cfg.xml");
    	System.out.println(cf);
    	SessionFactory sf=cf.buildSessionFactory();
    	System.out.println(sf);
    	Session ss=sf.openSession();
    	Employee e=(Employee)ss.load(Employee.class, 10);
    	System.out.println("Employee name is "+e.getName());
    	System.out.println("Employee ID is "+e.getId());
    	System.out.println("Employee address is "+e.getAddress());
    	e.setAddress("Delhi");
    	Transaction tr=ss.beginTransaction();
    	ss.saveOrUpdate(e);
    	tr.commit();
    	System.out.println("Employee Updated");
    	ss.close();
    	//System.out.println("Employee Saved.... Check database");
    }
}
