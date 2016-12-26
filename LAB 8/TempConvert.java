import java.util.Scanner;

public class TempConvert{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Please type a temperature in Fahrenheit: ");
      double tempInF = input.nextDouble(); //Assigns tempInF to next double input
      //Assigns tempInC to return value of changeToCelsius()
      double tempInC = changeToCelsius(tempInF); 
      //Prints result up to two decimal places
      System.out.printf("%.2f Fahrenheit is %.2f in Celsius", tempInF, tempInC);
   }
   
   public static double changeToCelsius(double g){
      double tempInC = (g - 32) / 1.8; //calculates conversion
      return tempInC;
   }
}