public class One {
	// Method Overriding
	String brand;
	int id;
	public One()
	{
		brand="Dell";
		id=1;
	}
	public void info()
	{
		System.out.println("Brand= "+brand+ "\nId= "+id); 
	}
}
class Two extends One{
	String os;
	public Two()
	{
		brand="lenova";
		id=2;
		os="Windows 10";
	}
	public void info()
	{
		System.out.println("Brand= " +brand+ "\nId= " +id+ "\nOs= " +os);
	}
	public static void main(String[] args) {
		One obj1=new One();
		obj1.info();
		Two obj2=new Two();
		obj2.info();
	}
}
