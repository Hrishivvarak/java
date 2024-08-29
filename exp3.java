import java.util.Scanner;
public class exp3 {
    public static void main(String []args)
    {
        try (Scanner ob = new Scanner(System.in)) {
            int age;
            long prn;
            float cgpa;
            System.out.println("Enter age: ");
            age = ob.nextInt();
            ob.nextLine();
            System.out.println("Enter name: ");
            String name = ob.nextLine();
            System.out.println("Enter PRN: ");
            prn = ob.nextLong();
            System.out.println("Enter CGPA: ");
            cgpa = ob.nextFloat();
            System.out.println("Details*******");
            System.out.println("Student name:"+name+"\nStudent age:"+age+"\nPRN:"+prn+"\nCGPA"+cgpa);
	    ob.close();
        }
    }
}
