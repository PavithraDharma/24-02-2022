// Method Overloading

public class MethodOverloading {
	public void add(int a,int b)
	{
		System.out.println("Integer values="+(a+b));
	}
	public void add(double c,double d)
	{
		System.out.println("Double value "+(c+d));
	}

	public static void main(String[] args) {
		MethodOverloading obj=new MethodOverloading();
		obj.add(2,3);
		obj.add(4.5,5.5);
	}
}
