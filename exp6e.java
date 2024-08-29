import java.util.Scanner; 
class Rectangle12 
{     
  int length; 
  int width; 
  int res; 
 void insert(int l, int w) 
 { 
  length = l; 
  width = w;   
 }   
 void calculateArea() 
 { 
  res = length*width;  
  System.out.println("Area :"+res); 
}  
}  
public class exp6e { 
    public static void main(String args[]) 
    { 
        Scanner ob = new Scanner(System.in);   
        Rectangle12 r1=new Rectangle12();  
        System.out.println("Ente the length and width:"); 
        int len = ob.nextInt(); 
        int wid = ob.nextInt(); 
        r1.insert( len, wid);   
        r1.calculateArea(); 
      }   
}