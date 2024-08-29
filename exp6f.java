import java.util.Scanner; 
 
public class exp6f  
{   
    void fact(int  n) 
    {   
        int fact=1;   
        for(int i=1;i<=n;i++) 
        {   
            fact=fact*i;   
        }   
        System.out.println("factorial is "+fact);   
    }   
    public static void main(String args[]) 
    {   
        int n; 
        Scanner ob1 = new Scanner(System.in); 
        System.out.println("Enter the NO:"); 
        n = ob1.nextInt(); 
        exp6f ob = new exp6f(); 
        ob.fact(n); 
ob1.close(); 
}   
}