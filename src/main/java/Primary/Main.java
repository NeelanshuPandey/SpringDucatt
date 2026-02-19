package Primary;



	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;

	
	public class Main {

		public static void main(String[] args) {

			ApplicationContext ioc = new AnnotationConfigApplicationContext("Primary");

			Employee emp = ioc.getBean(Employee.class);
			
			System.out.println(emp);
			
			
		}

	}

