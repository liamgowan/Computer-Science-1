import java.util.Scanner;

public class LargestSmallest{
   public static void main(String[] args){
      int num1, num2, num3, max, min;
      Scanner input = new Scanner(System.in);
      //prompts user and assigns 3 numbers
      System.out.print("Enter three numbers: ");
      num1 = input.nextInt();
      num2 = input.nextInt();
      num3 = input.nextInt();
      
      max = largest(num1, num2, num3); //calls largest() method
      
      min = smallest(num1, num2, num3);//calls smallest() method
         
      System.out.println("The largest number is " + max);
      System.out.print("The smallest number is " + min);
   }
   
   public static int largest(int num1, int num2, int num3){
   /*method tests to see which number is the largest, and then
   returns that number */
      if(num1 > num2 && num1 > num3)
         return num1;
      else if(num2 > num1 && num2 > num3)
         return num2;
      else if(num3 > num1 && num3 > num2)
         return num3;
      else
         return num1;
   }
   
   public static int smallest(int num1, int num2, int num3){
   /*method tests to see which number is the smallest, and then
   returns that number */
      if(num1 < num2 && num1 < num3)
         return num1;
      else if(num2 < num1 && num2 < num3)
         return num2;
      else
         return num3;
   }
}
      