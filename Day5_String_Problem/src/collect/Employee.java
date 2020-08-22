package collect;

public class Employee {

	private String name;
	private int id;
	private int salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int id, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		System.out.println(" inside hascode for " + this.name);
		return this.id;

	}

	@Override
	public boolean equals(Object obj) {
		System.out.println(" inside equals for " + this.name);
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (salary != other.salary)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}

}// end of class
