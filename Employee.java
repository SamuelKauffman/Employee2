package PracticeConstructor;

public class Employee {
	private String name;
	private double PayRate;
	private final int EmployeeID;
	private static int nextID=1000;
	
	public static final double
StartingPayRate=12.5;
		public Employee(String name) {
			this.name=name;
			EmployeeID=getNextID();
		}
		public Employee(String name, double PayRate) {
			this.name=name;
			this.PayRate=PayRate;
			EmployeeID=getNextID();
		}
		public String getName() {
			return name;
		}
		public double getPayRate() {
			return PayRate;
		}
		public int EmployeeID() {
			return EmployeeID;
		}
		public void changeName(String newName) {
			name = newName;
		}
		public void changePayRate(double newRate) {
			PayRate=newRate;
		}
		public static int getNextID(){
			return nextID++;
		}
	}

