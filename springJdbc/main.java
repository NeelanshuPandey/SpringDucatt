package springJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class main {

	
	public static void main(String[] args) {
		
		System.out.println("Program Start:");
		
		//spring JDBC-Template
	ApplicationContext con =new ClassPathXmlApplicationContext("springJdbc/springjdbc.xml");
		
	JdbcTemplate temp =	con.getBean("jdbcTemplate",JdbcTemplate.class);
		
	
	//insert query 
	
	//String query="insert into employe (id,name,city) values(?,?,?)";
	
	String query1="UPDATE employe SET city = ? WHERE id = ?";
	
	//int result=temp.update(query,1,"neelanshu","lucknow");
	
	int result2=temp.update(query1,"Delhi",1);
	
	//System.out.println("number of record inserted:-"+result);
	
	System.out.println("number of record inserted:-"+result2);
	}
	
	
	
}
