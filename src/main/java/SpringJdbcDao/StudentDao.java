package SpringJdbcDao;

import java.util.List;

public interface StudentDao {

	public int insert(Student student); 
	public int update(Student student);
	public int delete(Student student);
	public Student getStudent(int StudentId);
	public List<Student> getAllStudents();
}
