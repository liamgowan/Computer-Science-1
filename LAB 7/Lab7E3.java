import java.util.Scanner;

public class Lab7E3{
   public static void main(String[] args){
      String word = "";
      int num = 0;
      Scanner input = new Scanner(System.in);
      /*The following prompts user for word and number,
      assigns them to 'word' and 'num' */
      System.out.print("Please type a word: ");
      word = input.nextLine();
      System.out.print("Please type a number: ");
      num = input.nextInt();
      
      System.out.println();
      
      printWord(word, num);//calls printWord methof
   }
   
   public static void printWord(String word, int num){
      for(int i=0; i<num; i++) //has 'num' interations
         //the '%S converts word to capitalized form
         System.out.printf("%S\n", word);    
   }
}
         