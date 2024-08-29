
import java.util.Scanner;

class calculator {

    void add(int a, int b) {
        System.out.print("Addition = " + (a + b) + "\n");
    }

    void sub(int a, int b) {
        System.out.print("Subtraction = " + (a - b)+ "\n");
    }

    void mul(int a, int b) {
        System.out.print("Multiplication = " + (a * b)+ "\n");
    }

    void div(int a, int b) {
        if (a > b) {
            System.out.print("Division = " + (a / b)+ "\n"); 
        }else {
            System.out.println("Division = " + (b / a)+ "\n");
        }
    }
}

public class exp6a {

    public static void main(String args[]) {
        int n1, n2,cho;
        calculator ob = new calculator();
        Scanner ob1 = new Scanner(System.in);
        do {
            System.out.println("Menu\n 1.Addition\t 2.Subtraction\t 3.Multiplication \t 4.Division\t 5.Exit\n");
            System.out.println("Enter the Choice");
            cho = ob1.nextInt();
            switch (cho) {
                case 1:
                    System.out.println("Enter the two nos:");
                    n1 = ob1.nextInt();
                    n2 = ob1.nextInt();
                    ob.add(n1, n2);
                    break;

                case 2:
                    System.out.println("Enter the two nos:");
                    n1 = ob1.nextInt();
                    n2 = ob1.nextInt();
                    ob.sub(n1, n2);
                    break;

                case 3:
                    System.out.println("Enter the two nos:");
                    n1 = ob1.nextInt();
                    n2 = ob1.nextInt();
                    ob.mul(n1, n2);
                    break;

                case 4:
                    System.out.println("Enter the two nos:");
                    n1 = ob1.nextInt();
                    n2 = ob1.nextInt();
                    ob.div(n1, n2);
                    break;
                default:
                    System.out.println("Exit.......");
            }

        } while (cho == 5);
        ob1.close();
    }
}
