class Employeee{
	
	private String name;
	private String work;
	private long salary;
	private long totalMoney;
	
	 boolean leftJob= false;
	 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public long getTotalMoney() {
		return totalMoney;
	}
	public void setTotalMoney(long totalMoney) {
		this.totalMoney = totalMoney;
	}
	
	void receiveSalary(){
		if (!leftJob){
			this.salary =+ totalMoney;
			System.out.println("You receive "+ salary + "$" + "Now you have " + totalMoney);
		} else {
			System.out.println("You dont have a job. You cant receieve a money.");
		}
	}
	
}


public class Employee {

	
	public static void main(String[] args) {
		Employeee employee = new Employeee();
		employee.setName("Tom");
		employee.setWork("Teacher");
		employee.setSalary(2500);
		employee.setTotalMoney(5000);
		System.out.println(employee.toString());
		
		
	}

}
