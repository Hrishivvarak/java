import java.util.*;
public class exp1a {
    public static void main(String args[])
        {
            Scanner ob = new Scanner(System.in);
            int n1,n2,n3,ch;
        do
        {
        System.out.println("Menu--\n1.ADD 2.SUB 3.MUL 4.DIV 5.EXIT\n Enter the Choice:"); 
        ch = ob.nextInt();
        switch (ch) {
        case 1:
                System.out.println("Enter 1st Number: "); 
                n1 = ob.nextInt();
                System.out.println("Enter 2nd Number: "); 
                n2 = ob.nextInt();
                n3=n1+n2;
                System.out.println("Addition ="+ n3 );
                break;
        case 2:
            System.out.println("Enter 1st Number: "); 
            n1 = ob.nextInt();
            System.out.println("Enter 2nd Number: "); 
            n2 = ob.nextInt();
            n3=n1-n2;
            System.out.println("Subtraction =" + n3);
            break;

        case 3:
            System.out.println("Enter 1st Number: ");
            n1 = ob.nextInt();
            System.out.println("Enter 2nd Number: ");
            n2 = ob.nextInt();
            n3=n1*n2;
            System.out.println("Multiplication = "+n3);
            break;

        case 4:
            System.out.println("Enter 1st Number: ");
            n1=ob.nextInt();
            System.out.println("Enter 2nd Number: ");
            n2=ob.nextInt();
            n3=n1/n2;
            System.out.println("Division = "+n3);
            break;

        default:
        System.out.println("Exit..");
        }

        } while (ch!=5);
        ob.close();

}
}