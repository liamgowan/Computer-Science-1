import java.util.Scanner; //imports scanner class

public class NumberCalc{
   public static void main(String[] args){
      double num1, num2, num3, average, maximum, minimum; //declares double variables
      Scanner input = new Scanner(System.in); //makes input a scanner variable
      
      System.out.print("Please enter number 1: "); //asks user for 1st number
      num1 = input.nextDouble();                   //Assigns input to num1
      System.out.print("Please enter number 2: "); //asks user for 2nd number
      num2 = input.nextDouble();                   //Assigns input to num2
      System.out.print("Please enter number 3: "); //asks user for 3rd number
      num3 = input.nextDouble();                   //Assigns input to num3
      
      average = (num1 + num2 + num3)/3.0;          //Calculates average
      
      /*Since Math.max can only accept two arguments, the maximum value of 
      num1 and num2 is saved to maximum. Then a second Math.max is performed,
      finding the maximum between the first maximum and num3. */
      
      maximum = Math.max(num1, num2);
      maximum = Math.max(maximum, num3);
      
      /*Since Math.min can only accept two arguments, the minimum value of 
      num1 and num2 is saved to minimum. Then a second Math.min is performed,
      finding the minimum between the first minimum and num3. */
      
      minimum = Math.min(num1, num2);
      minimum = Math.min(minimum, num3);
      
      //The following prints the numbers, average, min and max value.
      System.out.print("The average of " + num1 + ", " + num2 + ", "
                       + num3 + " is " + average + ".\n" +
                       "The largest number is " + maximum + ".\n" +
                       "The smallest number is " + minimum + ".");
   }
}
  