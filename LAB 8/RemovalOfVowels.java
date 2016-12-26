import java.util.Scanner;

public class RemovalOfVowels{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      String wordOrPhrase = "";
      //prompts user for string, assigns to String variable
      System.out.print("Type a string: ");
      wordOrPhrase = input.nextLine(); 
      //newString is equal to return value of removeVowels() method
      String newString = removeVowels(wordOrPhrase);
      //prints newString
      System.out.println("New string: " + newString);
      System.out.print("Thank you for using the system");
   }
   
   public static String removeVowels(String word){
      String newString = "";
      newString = word.replaceAll("[aeiou]", ""); //removes all vowels
      return newString;
   }
}