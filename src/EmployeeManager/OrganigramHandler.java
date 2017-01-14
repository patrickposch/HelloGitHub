package EmployeeManager;

public class OrganigramHandler
{

	public static void main(String[] args)
	{

		EmployeeManager em = new EmployeeManager();

		Employee emp1 = new Employee(123, "Max Mustermann", 1000.0, "Engineering");
		em.addEmployee(emp1);

		Employee emp2 = new Employee(456, "Susi Sorglos", 2500.0, "Engineering");
		em.addEmployee(emp2);

		Employee emp3 = new Employee(789, "Ano Nym", 4900.0, "Management");
		em.addEmployee(emp3);

		emp1.setSuperior(emp2);
		emp2.setSuperior(emp3);

		emp1.setRole("little bitch");

		System.out.println(getChainofCommand(emp1));

	}

	public static String getChainofCommand(Employee employee)
	{
		String chain = employee.getName() + " [" + employee.getRole() + "]";

		if (employee.getSuperior() == null)
			return chain;

		return chain + " -> " + getChainofCommand(employee.getSuperior());

	}
}