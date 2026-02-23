package SpringJdbcDao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao{

	
	private JdbcTemplate jdbcTemplate;
	
	
	//insert code 
	@Override
	public int insert(Student student) {
		
		String query="insert into employe (id,name,city) values(?,?,?)";
	int r=	 	this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
	return r;
		
	}
	//update code
	@Override
	public int update(Student student) {
	
		String Uquery="update employe set name=?,city=? where id=?";
	int up=	this.jdbcTemplate.update(Uquery,student.getName(),student.getCity(),student.getId());
		
		
		return up;
	}
	//Deleting data
	@Override
	public int delete(Student student) {
		String Delete="delete from employe where id=?";
		int del=this.jdbcTemplate.update(Delete,student.getId());
		return del;
	}
	
	//Select Query
	@Override
	public Student getStudent(int StudentId) {
	
		String select="select * from employe where id=?";
		
		RowMapper <Student> rowMapper=new RowMapperImpl();
		
		Student sel=this.jdbcTemplate.queryForObject(select,rowMapper,StudentId);
		
		return sel;
	}
	
	// Select All students
	@Override
	public List<Student> getAllStudents() {
		String query="Select * from employe ";
		List<Student> student=this.jdbcTemplate.query(query,new RowMapperImpl());
		return student;
	}
	
	
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
	this.jdbcTemplate = jdbcTemplate;
	}
	
	
	

	

	
	
}
