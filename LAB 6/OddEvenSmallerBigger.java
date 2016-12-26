import java.util.Scanner;

public class OddEvenSmallerBigger{
   public static void main(String[] args){
      int num1, num2;
      Scanner input = new Scanner(System.in);
      
      //prompts user for 2 numbers, assigns accordingly
      System.out.print("Please type 2 numbers: ");
      num1 = input.nextInt();
      num2 = input.nextInt();
      
      if(num1 == num2)           //makes sure there is not an error
         System.out.print("Error: The numbers cannot be the same");
      else if(num1 < num2){      // sees if first number is less than second
         System.out.print("The even numbers between " + num1 + " and " + num2 + ": ");
         while(num1 < num2){     //while num1 is less than num2
            if(num1%2 == 0)      //check if the remainder of num1/2 is 0
               System.out.print(num1 + " "); //print num1 if it is
            num1++;              //increase num1 by 1
         }
      }
      else if(num1 > num2){      //sees if first number is greater than second
         System.out.print("The even numbers between " + num2 + " and " + num1 + ": ");
         while(num1 >= num2){    //while num1 is greater than or equal to num2
            if(num1%2 == 0)      //program will see if its remainder when divided by 2 is 0
               System.out.print(num1 + " "); //if it is, print num1
            num1--;              //decrease num1 by 1
         }
      }    
   }
}
      
         