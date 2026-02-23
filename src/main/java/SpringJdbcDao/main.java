package SpringJdbcDao;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class main {

	
	public static void main(String[] args) {
		
		System.out.println("Program Start:");
		
		//spring JDBC-Template
	ApplicationContext con =new ClassPathXmlApplicationContext("SpringJdbcDao/springjdbc.xml");
		
	StudentDao studentdao=	con.getBean("StudentDao",StudentDao.class);
	
	Student student=new Student();
//	student.setId(4);
//	student.setName("Karan");
//	student.setCity("Amethi ");
	
//	student.setId(9);
//	student.setName("Nandlal");
//	student.setCity("Mathura ");
//	
//	int result=studentdao.insert(student);
////	
//	System.out.println(result);
	
	//update query :-
//	
//	student.setName("NP");
//	student.setCity("LKO");
//	student.setId(1);
//	int res=studentdao.update(student);
//	System.out.println(res);
	
	//delete Query:-
	
//	student.setId(4);
//	int del=studentdao.delete(student);
//	System.out.println(del);
//	
	// Select query for single object
//	
//	Student student1=studentdao.getStudent(1);
//	System.out.println(student1);
//	
//	Student student2=studentdao.getStudent(2);
//	System.out.println(student2);
	
	
	List<Student>students=studentdao.getAllStudents();
	
	for(Student s: students) {
		
		System.out.println(s);
	}
	}
	
	
	
}
