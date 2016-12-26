import java.util.Scanner;// imports scanner

public class Multiply{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Please type a number: ");//prompts user for number
      int number = input.nextInt(); //saves input to number
      int i = 1;
      //while loop calculates i*number, until i = number
      while(i <= number){
         System.out.println(i + " x " + number + "=" + i * number);
         i++;
      }
   }
}