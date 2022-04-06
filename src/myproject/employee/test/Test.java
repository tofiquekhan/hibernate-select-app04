package myproject.employee.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import myproject.employee.pojo.Employee;

public class Test {

	public static void main(String[] args) {
		Configuration configuration = null;
		SessionFactory sessionFactory = null;
		Session session = null;
		
		try {
		configuration = new Configuration();
		configuration.configure("myproject/employee/resources/hibernate.cfg.xml");
		sessionFactory = configuration.buildSessionFactory();
		session = sessionFactory.openSession();
		/*Employee employee = (Employee)session.load("myproject.employee.pojo.Employee", 80);
		if(employee == null) {
			System.out.println("Employee does not existed");
		}else {
		System.out.println(employee.getEno());
		System.out.println(employee.getEname());
		System.out.println(employee.getEsal());
		System.out.println(employee.getEaddr());
		}*/
		System.out.println("Before Calling Load method");
		Employee employee = (Employee) session.load(Employee.class, 8);
		System.out.println("After Calling Load Method");
//		System.out.println(employee.getEno());
//		System.out.println(employee.getEname());
//		System.out.println(employee.getEsal());
//		System.out.println(employee.getEaddr());
		
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
			sessionFactory.close();
		}
		
		
		
	}
}
