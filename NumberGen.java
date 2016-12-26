import java.util.Scanner;

public class NumberGen{
   public static void main(String[] args){
      int num, counter;
      counter = 0;
      Scanner input = new Scanner(System.in);
      
      //asks user for number between 4 & 10, assigns to num
      System.out.print("Please type a number between 4 and 10: ");
      num = input.nextInt();
      
      //makes sure num is between 4 & 10
      while(!(num >= 4 && num <= 10)){
         System.out.print("The number was not between 4 and 10. \nTry again: ");
         num = input.nextInt();
      }
      
      //Prints the pattern
      while(counter < num){
         System.out.print(num + " ");
         counter++;
      }
   }
}
      