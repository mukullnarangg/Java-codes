class Employee {
	String name;
	int year;
	int salary;
	String address;

Employee(String name, int year, int salary, String address) {
	this.name = name;
	this.year = year;
	this.salary = salary;
	this.address = address;
}

public static void main(String[] args){
	Employee[] employees = new Employee[3];

	employees[0] = new Employee("Robert", 1994, 25000, "64C- WallsStreat");
	employees[1] = new Employee("Sam", 2000, 30000, "68D- WallsStreat");
	employees[2] = new Employee("John", 1999, 20000, "26B- WallsStreat");

	System.out.println("Name\tYear of Joining\tSalary\t\tAddress");

	for (Employee emp : employees) {
	System.out.println(emp.name + "\t" + emp.year + "\t\t" + emp.salary + "\t\t" + emp.address);
		}
	}
}
