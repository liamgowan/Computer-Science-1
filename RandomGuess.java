import java.util.Scanner; // imports scanner class
import java.util.Random; //imports random class

public class RandomGuess{
   public static void main(String[] args){
      int numberPicked, numberGuessed, counter;
      counter = 0;
      Random randomNumber = new Random();
      numberPicked = randomNumber.nextInt(101); //makes numberPicked between 0-100
      Scanner input = new Scanner(System.in);
      
      System.out.print("Guess a number between 0 and 100." +
                       "\nEnter your guess: ");
      numberGuessed = input.nextInt();
      
      /*While the number guessed by user is not equal to the random number,
      the following block to code will test to see if it's higher or lower,
      and will then tell the user. It then gets the user to enter another
      number. Everytime the user makes another guess, the counter goes up by one.
      */
      
      while(numberGuessed != numberPicked){
         if(numberGuessed > numberPicked){
            System.out.print("Your guess is too high." +
                             "\nEnter your guess: ");
            numberGuessed = input.nextInt();
         }
         else{
            System.out.print("Your guess is too low." +
                             "\nEnter your guess: ");
            numberGuessed = input.nextInt();
         }
         counter++;
      }
      
      //Congratulations user and tells them # of guesses.
      System.out.print("Great job. You guessed the correct number in "
                       + (counter + 1) + " guesses!");
   }
}
           
            
            