import java.util.Scanner; //imports scanner class

public class FtoC{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in); //declares 'input' as scanner variable
      double celsius, fahrenheit;             //declares double variables
      
      System.out.print("Please type a temperature in degrees Fahrenheit: "); //prompts user for temp
      fahrenheit = input.nextDouble(); //Assigns input to fahrenheit
      
      celsius = (fahrenheit - 32)/1.8; //Converts temperature from F to C
      System.out.print(fahrenheit + " F = " + celsius + " C"); //Displays temperature in C
   }
}