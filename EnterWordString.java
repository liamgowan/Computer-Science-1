import java.util.Scanner; //import scanner class

public class EnterWordString{
   public static void main(String[] args){
      String word, wordCAP, letterPicked; 
      char letter;
      Scanner input = new Scanner(System.in);
      int letterCounter = 0; //initializes letterCounter to 0
      
      /*Prompts user for word, saves it to 'word' string variable.
      Program then prompts user for letter, which is saved to the
      string variable 'letterPicked', and char variable 'letter'
      is the first character of letterPicked. */
      System.out.print("Enter a word: "); 
      word = input.nextLine();
      System.out.print("Enter a letter: ");
      letterPicked = input.nextLine();
      letter = letterPicked.charAt(0);
      
      wordCAP = word.toUpperCase(); //converts word to capitals, saves to 'wordCAP'
      
      //Tells user word in caps, and then the length.
      System.out.println("\nThe word is " + wordCAP + ".");
      System.out.println("There are " + word.length() + " letters in the word.");
      
      //For loop determines how many of selected letter are present
      for(int i = 0; i < word.length(); i++){
             if(letter == word.charAt(i))
                letterCounter++;
      }
      //Displays how many of the selected letter are in 'word'.
      System.out.println("Number of " + letter + "'s in the word: " + 
                         letterCounter + ".");
      System.out.print("The word backwards is ");
      
      int numberOfLetters = wordCAP.length();
      
      //Prints word in reverse
      for(int j = 1; j <= numberOfLetters; j++){
         System.out.print(wordCAP.charAt(numberOfLetters - j));
      }     
   }
}
      