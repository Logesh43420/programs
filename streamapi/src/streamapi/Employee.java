package streamapi;

public class Employee {
    String empName;
    int empId;
    double Salary;

    public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public double getSalary() {
		return Salary;
	}


	public void setSalary(double salary) {
		Salary = salary;
	}


	public Employee(String empName, int empId, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.Salary = salary;
    }
}
