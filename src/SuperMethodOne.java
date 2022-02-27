// Super method usage avoids duplicates and prints parent class values in child class

class SuperMethodOne {
	String brand;
	int id;
	public SuperMethodOne()
	{
		brand="Dell";
		id=1;
	}
	public void info()
	{
		System.out.println("First method");
		System.out.println("Brand= "+brand+ "\nid= "+id);
	}
}
class SuperMethodTwo extends SuperMethodOne{
	String brand;
	int id;
	String os;
	public SuperMethodTwo()
	{
		brand="lenova";
		id=2;
		os="Windows 10";
	}
	public void info()
	{
		super.info();
		System.out.println("Second method");
		System.out.println("Brand= " +brand+ "\nId= " +id+ "\nOs= " +os);
	}
	public static void main(String[] args) {
		SuperMethodTwo obj=new SuperMethodTwo();
		obj.info();
	}
}
