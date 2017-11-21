public class Employee{
	private int id;
	private String firstName;
	
	public Employee(){
	
		this.id = 1;
		this.firstName = "Juan";
	}
	
	public void setEmployeeId(int employeeId){
		this.id = id;
	}
	
	public int getEmployeeId(){
		return id;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}

}
