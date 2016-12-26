import java.util.Scanner;

public class CtoF{
   public static void main(String[] args){
      double celsius, fahrenheit;
      Scanner input = new Scanner(System.in);
      //prompts user for temp, assigns to 'celsius'
      System.out.print("Please enter temperature in Celsius: ");
      celsius = input.nextDouble();
      fahrenheit = (celsius * 9/5) +32; //converts to fahrenheit
      //Prints celsius and fahrenheit but with only one decimal.
      System.out.printf("%.1f Celsius is %.1f Fahrenheit", celsius, fahrenheit);
   }
}