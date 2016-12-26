//This program shall request information from user for words, and make a story.

import java.util.Scanner; //imports Scanner class

public class MadLibs{
   public static void main(String[] args){
      String name1, name2, sport, action, uni1, uni2, food; int num; //Creates needed variables
      Scanner input = new Scanner(System.in); //Creates variable "input" of scanner class
      
      System.out.print("Enter your name: ");                //Asks user for name
      name1 = input.nextLine();                             //Makes name1 equal to input
      System.out.print("\nEnter another name: ");           //Asks user for another name
      name2 = input.nextLine();                             //makes name2 equal to input
      System.out.print("\nEnter a sport: ");                //Asks user for a sport
      sport = input.nextLine();                             //Makes sport equal to input
               //Below asks user for an action
      System.out.print("\nThe last time you were happy, what action did you do: "); 
      action = input.nextLine();                            //makes action equal to input
      System.out.print("\nEnter the name of your university: "); //Asks user for name of univeristy
      uni1 = input.nextLine();                              //makes uni1 equal to input
      System.out.print("\nEnter another university: ");     //Asks user for another university
      uni2 = input.nextLine();                              //makes uni2 equal to input
      
      /*While loop checks is the uni1 is equal to uni2 string.
      If they are equal, it will ask user to put in another univeristy
      and will then assign the string to uni2, ending the loop. */
      
      while(uni1.equals(uni2)) {
         System.out.print("You answered the same university twice."+ 
                          "\nPlease enter a different one: ");
         uni2 = input.nextLine();
      }
      
      System.out.print("\nEnter your favourite food: ");     //asks user for favourite food
      food = input.nextLine();                               //makes food equal to input
      System.out.print("\nEnter a number between 10 and 20: "); //Asks user for a number
      num = input.nextInt();                                 //makes num equal to input
      
      /*This while loop checks to see if 'num' is less than 10, or
      greater than 20. If it is, it will ask the user to put in
      a number than is between 10 and 20. */
      
      while(num < 10 || num > 20) {
         System.out.println("Number invalid not between 10 and 20.");
         System.out.print("Please enter a number between 10 and 20: ");
         num = input.nextInt();
      }
      //The following prints out the story.
      System.out.println("THIS IS THE BEST STORY EVER\n");
      System.out.print("My name is " + name1 + ". ");
      System.out.println("And my archenemy is " + name2+ ".");
      System.out.println("I play " + sport + " for " + uni1 + " and " 
                       + name2 + " plays for " + uni2 + ".");
      System.out.println("At our last game we won by " + num + " points.");
      System.out.println("I was so happy I " + action + " and I went out and"
                         + " ate my favourite food " + food + ".");
      System.out.println("The End!");    
      }
}