class add123{
    void add(int x, int y)
    {
    System.out.println("Addition of two int nos="+(x+y));
}
    void add(double x, double y)
    {
    System.out.println("Addition of two float nos="+(x+y));
    }
    void add(int x, int y, int z)
    {
    System.out.println("Addition of three int nos="+(x+y+z));
    }
    void add(double x, double y, double z)
    {
    System.out.println("Addition of three float nos="+(x+y+z));
    }
}
public class exp7c {
public static void main(String[] args) {
    add123 ob = new add123();
    ob.add(2,3);
    ob.add(5.5,4.5);
    ob.add(5,5,5);
    ob.add(5.5,5.5,5.5);
}
}