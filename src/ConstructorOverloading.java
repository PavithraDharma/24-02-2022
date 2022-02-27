public class ConstructorOverloading {
	// Constrcutor Overloading
	String brand;
	int id;
	ConstructorOverloading()
	{
		brand="Dell";
		id=1;
	}
	ConstructorOverloading(String brand,int id)
	{
		this.brand=brand;
		this.id=id;
	}
	public void info()
	{
		System.out.println("Brand= " +brand+ " and id= " +id);
	}

	public static void main(String[] args) {
		ConstructorOverloading obj=new ConstructorOverloading();
		obj.info();
		ConstructorOverloading obj1=new ConstructorOverloading("Lenova",2);
		obj1.info();
	}
}
