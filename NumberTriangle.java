import java.util.Scanner; //Imports scanner class

public class NumberTriangle
{
   public static void main(String[] args)
   {
      int num1, num2; //delcares integer variables
      Scanner keyboard = new Scanner(System.in); //declares 'keyboard' as scanner type variable
      System.out.print("Enter a number between 0-4: "); //Asks user to enter value 
      num1 = keyboard.nextInt();                        //Assigns value to num1
      
      /*If the value is less than 0, or greater than 4, the while loop
      will ask for a number that is and will save that as num1 instead */
      
      while(num1 < 0 || num1 > 4){
         System.out.print("The number you entered was not between 0-4.\n" +  
                          "Please try again: ");
         num1 = keyboard.nextInt();
      }
      
      System.out.print("Enter a number between 5-9: "); //Asks user for a value
      num2 = keyboard.nextInt();                        //Assigns value to num2
      
      /*If the value is less than 5, or greater than 9, the while loop
      will ask for a number that is and will save that as num2 instead */
      
      while(num2 < 5 || num2 > 9){
         System.out.print("The number you entered was not between 5-9.\n" +  
                          "Please try again: ");
         num2 = keyboard.nextInt();
      }
      
      //This prints the triangle and upsidedown triangle with numbers.
      System.out.println("\n      " + num1 +"    " + num2+ " " + num2+ " " + num2+ " " + num2+ "\n"
                        +"     " + num1 + " " + num1 + "    " + num2 + " " + num2 + " " + num2+ "\n"
                        +"    " + num1 + " " + num1 + " " + num1 + "    " + num2 + " " + num2 + "\n"
                        +"   "+ num1 + " " + num1 + " " + num1 + " " + num1 + "    " + num2);
          
   }
}
      