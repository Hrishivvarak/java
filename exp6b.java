
import java.util.Scanner;

class demo {

    static class demo1 {

        void Area1(int a, int b) {
            System.out.println("Area from static nested class = " + (a * b));
        }
    }

    class demo2 {

        void Area2(int a, int b) {
            System.out.println("Area from nomal nested class = " + (a * b));
        }
    }
}

public class exp6b {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter two nos:");
        int n1 = ob.nextInt();
        int n2 = ob.nextInt();
        demo.demo1 ob1 = new demo.demo1();

        demo ob2 = new demo();
        demo.demo2 ob3 = ob2.new demo2();

        ob1.Area1(n1, n2);
        ob3.Area2(n1, n2);
        ob.close();
    }
}
