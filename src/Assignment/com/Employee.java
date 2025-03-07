package Assignment.com;

public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void displayDetails() {
		System.out.println("id: " + id + ", name: "+ name + ", salary: "+ salary);
	}
	
	
				
				
	

	public static void main(String[] args) {
		Employee obj1 = new Employee(101,"Alice",50000);
		Employee obj2 = new Employee(102, "bob", 45000);
		Employee obj3 = new Employee(103, "john", 40000);
		
		
		obj1.displayDetails();
		obj2.displayDetails();
		obj3.displayDetails();
		
		

	}

}
