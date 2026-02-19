package Primary;



	
	
	

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.context.annotation.Scope;
	import org.springframework.stereotype.Component;

	@Component
	@Scope(value = "prototype")
	public class Employee {
		
		private int id =101;
		private String name="Guest";
		private int salary = 10_000;
		
		
		private IAddress adddress;
		
		public Employee() {
			
		}
		public Employee(int id, String name, int salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		
		public Employee(IAddress address) {
			this.adddress=address;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getSalary() {
			return salary;
		}
		public void setSalary(int salary) {
			this.salary = salary;
		}
		public IAddress getAdddress() {
			return adddress;
		}
		@Autowired
		@Qualifier(value = "address1")
		public void setAdddress(IAddress adddress) {
			System.out.println("Employee.setAdddress()");
			this.adddress = adddress;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adddress=" + adddress + "]";
		}
		
	}
	
	
	
	
	
	
	

