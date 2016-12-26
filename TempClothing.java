import java.util.Scanner;

public class TempClothing{
   public static void main(String[] args){
      double temp;
      Scanner input = new Scanner(System.in);
      //prompts user for temperature, assigns to temp
      System.out.print("Enter the temperature: ");
      temp = input.nextDouble();
      //The following produces the proper response for the temperature
      if(temp >= 30)
         System.out.print("It is really hot - stay indoors");
      else if(temp >= 25 && temp < 30)
         System.out.print("Wear sunscreen and a hat");
      else if(temp >= 20 && temp < 25)
         System.out.print("You won't need a sweater today");
      else if(temp >= 15 && temp < 20)
         System.out.print("You will need a sweater today");
      else if(temp >= 10 && temp < 15)
         System.out.print("You should take a jacket");
      else if(temp >= 0 && temp < 10)
         System.out.print("Wear a hat and mittens");
   }
}