import java.util.Scanner; //Imports scanner class

public class AverageFinder{
   public static void main(String[] args){
      double num1, num2, num3, num4, average;   //Declares double variables
      
      Scanner input = new Scanner(System.in); //Declares 'input' as scanner variable
      
      System.out.print("Please type a value: ");//Prompts user for number
      num1 = input.nextDouble();                //Assigns input to num1
      System.out.print("Please type a value: ");//Prompts user for number
      num2 = input.nextDouble();                //Assigns input to num2
      System.out.print("Please type a value: ");//Prompts user for number
      num3 = input.nextDouble();                //Assigns input to num3
      System.out.print("Please type a value: ");//Prompts user for number
      num4 = input.nextDouble();                //Assigns input to num4
      
      average = (num1 + num2 + num3 + num4)/4;  //Calculates average
      
      System.out.print("\n\nAverage = " + average); //Displays average
   }
}
   