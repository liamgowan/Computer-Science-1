import java.util.Scanner;
public class LETTERCHECKERTRIAL{
   public static void main(String[] args){ 
      String word1, word2;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a word: ");
      word1 = input.nextLine();
      System.out.print("Enter a word: ");
      word2 = input.nextLine();
      System.out.print("Common character/s between " + word1
                       + " and " + word2 + " is/are ");
      if(word1.length()>=word2.length())
         String lettersInBoth = join(word1, word2);
      else
         String lettersInBoth = join(word2, word1);
      System.out.print(lettersInBoth);
   }
      public static String join(String word1, String word2){
      String commonLetters = "";
      for(int i=0; i<word1.length(); i++){
         if(
      return commonLetters;
   }
}
