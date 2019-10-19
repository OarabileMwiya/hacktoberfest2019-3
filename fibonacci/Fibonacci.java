import java.util.Scanner;

public class Fibonacci {
  
  public static void main(String[] args) {
    
    Scanner numbers = new Scanner(System.in);
    
    int n, a = 0, b = 0, c = 1;
    
    System.out.print("Enter value of n:");
    
   n=numbers.nextInt();
   
   System.out.print("fibonacci Series:");
   
   for(int z = 1; z <=n; z++)
     
   {
     a = b;
     b = c;
     c = a + b;
     
     System.out.print(a+" ");
     
   }
  }
}
