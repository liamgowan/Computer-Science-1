import java.util.Scanner;

public class MiddleNumber{
   public static void main(String[] args){
      int num1, num2, num3, middle = 0;
      Scanner input = new Scanner(System.in);
      
      //prompts user and assigns 3 numbers
      System.out.print("Please type 3 numbers: ");
      num1 = input.nextInt();
      num2 = input.nextInt();
      num3 = input.nextInt();
      
      //To avoid errors, while loop ensures that all #s are different
      while(num1 == num2 || num1 == num3 || num2 == num3){
         System.out.print("Sorry, two or more of the numbers entered were the same."
                          + "\nPlease try again using non-equal numbers: ");
         num1 = input.nextInt();
         num2 = input.nextInt();
         num3 = input.nextInt();
      }
      
      /*The following if else statements decide which number
      entered is in the middle. This could have been done in half 
      the lines taken, however the instructions indicate that only
      && OR the || operators can be used. */
      if(num1 > num2 && num1 < num3)
         middle = num1;
      else if(num1 > num3 && num1 < num2)
         middle = num1;
      else if(num2 > num1 && num2 < num3)
         middle = num2;
      else if(num2 > num3 && num2 < num1)
         middle = num2;
      else if(num3 > num1 && num3 < num2)
         middle = num3;
      else if(num3 > num2 && num3 < num1)
         middle = num3;
      
      //Displays to the user what the middle number is.
      System.out.print("The number in the middle is: " + middle);
   }
}
      
      