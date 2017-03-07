package personBeispiel;

public class Customer extends Person
{
	int id;

	public Customer(String firstname, String lastname, int id)
	{
		super(firstname, lastname);
		this.id = id;
	}

	public void getInfo()
	{
		System.out.println("This is a customer");
	}

}
