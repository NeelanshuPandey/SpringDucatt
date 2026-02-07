package Com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import BeanClass.Employee;

public class Main {

	public static void main(String[] args) {
		
		
		
		ApplicationContext ioc=new ClassPathXmlApplicationContext("Employee.xml");	
			
		Employee bean=ioc.getBean("emp1",Employee.class);
		
		System.out.println(bean);
//		
//		bean.setName("Neelanshu");
//			
//		System.out.println(bean);
		
		
		
		
	}
	
	
	
	
	
}
