import java.util.Scanner;

public class EvenOdd{
   public static void main(String[] args){
      int num1, num2, total;
      Scanner input = new Scanner(System.in);
      System.out.print("Please input an integer: ");
      num1 = input.nextInt();
      System.out.print("Please input an integer: ");
      num2 = input.nextInt();
      
      total = num1 + num2; //calculates total
      
      if(total%2 == 0) //calculates if total is even or odd
         System.out.print(total + " is even");
      else
         System.out.print(total + " is odd");
   }
}
      