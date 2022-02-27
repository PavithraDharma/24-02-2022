// Covariant Return Type

class CovariantOne {
    String brand;
    int id;
    public CovariantOne()
    {
        brand="Dell";
        id=1;
    }
    public CovariantOne info()
    {
        System.out.println("Brand= "+brand+ "\nId= "+id); 
        return null;
    }
}
class CovariantTwo extends CovariantOne{
    String os;
    public CovariantTwo()
    {
        brand="lenova";
        id=2;
        os="Windows 10";
    }
    public CovariantTwo info()
    {
        System.out.println("Brand= " +brand+ "\nId= " +id+ "\nOs= " +os);
        return null;
    }
    public static void main(String[] args) {
        CovariantOne obj1=new CovariantOne();
        obj1.info();
        CovariantTwo obj2=new CovariantTwo();
        obj2.info();
    }
}
