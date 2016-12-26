import java.util.Random; //imports random class
import java.util.Scanner; //imports scanner class

public class RandomGen{
   public static void main(String[] args){
      Random randomNumber = new Random(); //declares random variable
      int number = randomNumber.nextInt(10) + 1; //makes number between 1-10, assigns to int
      int guess;                          // declares to int variable
      Scanner input = new Scanner(System.in); //declares scanner variable
      
      //prompts user for number, assigns it to guess
      System.out.print("I have a number between 1 and 10. " +
                       "Please enter your guess: ");
      guess = input.nextInt();
      
      if(guess != number){ //if guess is incorrect, tell user the number and good luck
         System.out.print("Wrong - It was " + number +   
                          ". Better luck next time.");
      }
      else //if guess is correct, tell user good guess
         System.out.print("Good guess");
   }
}
         
      