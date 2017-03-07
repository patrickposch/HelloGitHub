package ue10_Tiere;

public class TierVersuch
{

	public static void main(String[] args)
	{
		Frog quaxi = new Frog("Grün", 2);
		Cat puss = new Cat("Rot", 1, "Puss");
		Dog doggo = new Dog("Brown", 2, "Max");
		Lion king = new Lion("Brown", 2);

		Animal quaxiAsAnimal = (Animal) quaxi;
		Frog f2 = (Frog) quaxiAsAnimal;

		quaxiAsAnimal.walk();
		quaxi.walk();
		f2.walk();

		Nature list = new Nature();
		list.addAnimal(quaxi);
		list.addAnimal(puss);
		list.addAnimal(doggo);
		list.addAnimal(king);

		System.out.println(list.countColor("Brown"));

		System.out.println(list.getCountByColor());

		Dog dog = new Dog("Blue", 5, "Plerp");

		Animal d2 = dog;

		dog.walk();
		d2.walk();

	}

}
