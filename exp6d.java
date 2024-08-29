import java.util.Scanner;

class demo{
    int a1,b1;
    void getdata(int a , int b)
    {
        a1=a;
        b1=b;
    }
    void function1()
    {
        
        class Area{
            void fun1()
            {
                System.out.println("Area = "+(a1*b1));
            }
        }
        Area ob1 = new Area();
        ob1.fun1();
    }
}
public class exp6d {
    public static void main(String[] args) {
        Scanner ob1 = new Scanner(System.in);
        demo ob = new demo();
        int n1 = ob1.nextInt();
        int n2 = ob1.nextInt();
        ob.getdata(n1, n2);
        ob.function1();
        ob1.close();
    }
}
