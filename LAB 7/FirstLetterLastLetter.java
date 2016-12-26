import java.util.Scanner;

public class FirstLetterLastLetter{
   public static void main(String[] args){
      String word = "";
      Scanner input = new Scanner(System.in);
      //prompts user for string, assigns to 'word'
      System.out.print("Type a string: ");
      word = input.nextLine();
      
      checkString(word); //calls checkString method
   }
   
   public static void checkString(String word){
      //program is not case sensitive, so change word to caps
      String wordCap = word.toUpperCase();
      
      /*Program checks to see if the first character is the last 
      character or wordCap. It does this by using wordCap.length()
      -1, because if you do not subtract 1 it will cause an error
      as it will be out of range. */
      
         if(wordCap.charAt(0) == wordCap.charAt(wordCap.length()-1)){
            System.out.print(word + " begins and ends with " +
                             "the same letter");
         }
         else{
            System.out.print(word + " does not begin and end " +
                         "with the same letter");
         }
   }
}
                          