import java.util.Scanner;

public class CharacterRepeat{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a character: "); //prompts user for character
      String word = input.nextLine();//input saved to String variable 'word'
      char character = word.charAt(0);//first character of 'word' saved to 'character'
      
      /*The nested for loops print the design. The first (outer) one prints the line,
      the second (inner) one prints each character to the line. */
      
      for(int i = 0; i < 5; i++){
         for(int j = 0; j <= i; j++)
            System.out.print(character);
         System.out.println();
      }
   }
}