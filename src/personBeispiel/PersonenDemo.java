package personBeispiel;

public class PersonenDemo
{
	public static void main(String[] args)
	{
		Customer customer = new Customer("Susi", "Sorglos", 18);
		Person person = new Person("Farid", "A.");

		System.out.println(customer.getFirstname() + " " + customer.getLastname() + " " + customer.id);

		customer.getInfo();
		person.getInfo();
	}
}
