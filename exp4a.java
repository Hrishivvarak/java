import java.util.Scanner;
public class exp4a {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int ch;
        int []ar1 = new int[4];
        int []ar2 = new int[4];
        int []ar3 = new int[4];
            do { 
                    System.out.println("Menu--\n1.ADD 2.SUB 3.MUL 4.DIV 5.EXIT\n Enter the Choice:");
                    ch = ob.nextInt();
                    switch (ch) {
                        case 1:
                            System.out.println("Enter the elements for array 1:");
                            for (int i = 0; i < 4; i++){
                               ar1[i] = ob.nextInt();
                            }
                            System.out.println("Enter the elements for array 2:");
                            for (int i = 0; i < 4; i++){
                               ar2[i] = ob.nextInt();
                            }
                            for (int i = 0; i < 4; i++){
                                ar3[i] = ar1[i] + ar2[i];
                             }
                            System.out.println("Addition of array:");
                            for (int i = 0; i < 4; i++){
                                System.out.print(ar3[i]+" ");
                             }
                             System.out.println("\n");
                            break;
                        case 2:
                            System.out.println("Enter the elements for array 1:");
                            for (int i = 0; i < 4; i++){
                            ar1[i] = ob.nextInt();
                            }
                            System.out.println("Enter the elements for array 2:");
                            for (int i = 0; i < 4; i++){
                            ar2[i] = ob.nextInt();
                            }
                            for (int i = 0; i < 4; i++){
                                ar3[i] = ar1[i] - ar2[i];
                            }
                            System.out.println("Substraction of array:");
                            for (int i = 0; i < 4; i++){
                                System.out.print(ar3[i]+" ");
                            }
                            System.out.println("\n");
                            break;
                        case 3:
                            System.out.println("Enter the elements for array 1:");
                            for (int i = 0; i < 4; i++){
                            ar1[i] = ob.nextInt();
                            }
                            System.out.println("Enter the elements for array 2:");
                            for (int i = 0; i < 4; i++){
                            ar2[i] = ob.nextInt();
                            }
                            for (int i = 0; i < 4; i++){
                                ar3[i] = ar1[i] * ar2[i];
                            }
                            System.out.println("Multiplication of array:");
                            for (int i = 0; i < 4; i++){
                                System.out.print(ar3[i]+" ");
                            }
                            System.out.println("\n");
                            break;
                        case 4:
                            System.out.println("Enter the elements for array 1:");
                            for (int i = 0; i < 4; i++){
                            ar1[i] = ob.nextInt();
                            }
                            System.out.println("Enter the elements for array 2:");
                            for (int i = 0; i < 4; i++){
                            ar2[i] = ob.nextInt();
                            }
                            for (int i = 0; i < 4; i++){
                                ar3[i] = ar1[i] / ar2[i];
                            }
                            System.out.println("Division of array:");
                            for (int i = 0; i < 4; i++){
                                System.out.print(ar3[i]+" ");
                            }
                            System.out.println("\n");
                            break;
                        default:
                           System.out.println("Exit..");
                    }
            } while (ch!=5);
            ob.close();
    }
}