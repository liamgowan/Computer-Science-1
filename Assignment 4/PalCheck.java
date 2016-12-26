import java.util.Scanner; 

public class PalCheck{
   public static void main(String[] args){
      String word = "";
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a word: ");
      word = input.nextLine();
      boolean palState = palindrome(word); //calls palindrome()
      /*if palState is true, program will say word is a 
      palindrome, otherwise it will say it is not */
      if(palState)
         System.out.print(word + " is a palindrome");
      else
         System.out.print(word + " is not a palindrome");
   }
   
   public static boolean palindrome(String word){
      /*The following code converts 'word' to a char array,
      and then sets wordBackwards to the char array, only in reverse.
      */
      char lettersInWord[] = word.toCharArray(); 
      String wordBackwards = "";
      for(int i = 0; i<word.length(); i++)
         wordBackwards += "" + lettersInWord[word.length()-1-i]; 
      /*if word is equal to wordBackwards (meaning it is a palindrome),
      it will return true, otherwise false */ 
      if(word.equals(wordBackwards))
         return true;
      else
         return false;
   }
}