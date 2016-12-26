import java.util.Scanner;

public class LetterChecker{
   public static void main(String[] args){ 
      String word1, word2;
      Scanner input = new Scanner(System.in);
      //Prompts user for two words, saves them to String variables
      System.out.print("Enter a word: ");
      word1 = input.nextLine();
      System.out.print("Enter a word: ");
      word2 = input.nextLine();        
      String lettersInBoth = join(word1, word2); //calls join()
      
      /*If there are common characters, it will display them, 
      otherwise it will display that there are no common
      characters */
      if(!lettersInBoth.equals("") && lettersInBoth.length()==1){
         System.out.print("The common character between " + word1
                       + " and " + word2 + " is " + lettersInBoth);
      }
      else if(!lettersInBoth.equals("") && lettersInBoth.length()>1){
         System.out.print("Common characters between " + word1
                       + " and " + word2 + " are " + lettersInBoth);
      }
      else{
         System.out.print("There are no common characters in " + word1 +
                          " and " + word2);
      }
   }
   
   public static String join(String word1, String word2){
      int longerWord, shorterWord;
      String longWordString, shortWordString;
      
      /*Assigns int and String values to prepare for
      rest of program */
      if(word1.length()>=word2.length()){
         longerWord=word1.length();
         shorterWord=word2.length();
         longWordString = word1;
         shortWordString = word2;
      }
      else{
         longerWord=word2.length();
         shorterWord=word1.length();
         longWordString = word2;
         shortWordString = word1;
      }
      String commonLetters = "";
      
      //Adds common characters to commonLetters String
      for(int i = 0; i<longerWord; i++){
         for(int j = 0; j<shorterWord; j++){
            if(longWordString.charAt(i) == shortWordString.charAt(j) && word1.length()>=word2.length())
               commonLetters += word1.charAt(i);
            
            else if(longWordString.charAt(i) == shortWordString.charAt(j) && word1.length()<word2.length())
               commonLetters += word1.charAt(j);
         }
      }
      
      //Ensures that there is no repetition of characters
      for(int i=0; i<commonLetters.length(); i++){
         for(int j=0; j<commonLetters.length(); j++){
            if(commonLetters.charAt(i) == commonLetters.charAt(j)){
               String holder = "" + commonLetters.charAt(i);
               commonLetters = commonLetters.replaceAll(holder, "");
               commonLetters += holder; 
            }
         }
      }
      return commonLetters; //returns commonLetters
   }   
}