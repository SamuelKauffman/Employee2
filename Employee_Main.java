package PracticeConstructor;

public class Employee_Main {

	public static void main(String[] args) {
		Employee emp1 = new Employee("Sam", 19);
		System.out.println(emp1.getName()+ " ID: " + Employee.getNextID());
		Employee emp2 = new Employee("JOhnny", 19);
		System.out.println(emp2.getName()+ " ID: " + Employee.getNextID());
		emp1.changePayRate(30);
		System.out.println(emp1.getPayRate());
	}

}
