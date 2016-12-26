import java.util.Scanner;

public class StringComparison{
   public static void main(String[] args){
      String word1, word2, lowerCaseWord1, lowerCaseWord2;
      Scanner input = new Scanner(System.in);
      
      /*The following asks user for two words, saves them to
      word1 and word 2, and they are then saved as lowercase values.
      */
      
      System.out.print("Please type in a word: ");
      word1 = input.nextLine();
      lowerCaseWord1 = word1.toLowerCase();
      System.out.print("Please type in a word: ");
      word2 = input.nextLine();
      lowerCaseWord2 = word2.toLowerCase();
      
      if(lowerCaseWord1.equals(lowerCaseWord2)){ //determines if they're equal
         System.out.print("\n" + lowerCaseWord1 + " and " +
                          lowerCaseWord2 + " are the same");
      }
      else
         System.out.print("\n" + lowerCaseWord1 + " and " +
                          lowerCaseWord2 + " are not the same");
   }
}
   