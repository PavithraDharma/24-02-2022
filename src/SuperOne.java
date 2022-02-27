// Super keyword usage avoids duplicates and prints parent class values in child class

class SuperOne {
	String brand;
	int id;
	public SuperOne()
	{
		brand="Dell";
		id=1;
	}
}
class SuperTwo extends SuperOne{
	String brand;
	int id;
	String os;
	public SuperTwo()
	{
		brand="lenova";
		id=2;
		os="Windows 10";
	}
	public void Info()
	{
		System.out.println("Brand= " +super.brand+ "\nId= "+super.id); //Super keyword prints the parent class values too
		System.out.println("Brand= " +brand+ "\nId= " +id+ "\nOs= " +os);
	}
	public static void main(String[] args) {
		SuperTwo obj=new SuperTwo();
		obj.Info();
	}
}
