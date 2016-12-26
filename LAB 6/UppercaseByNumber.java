import java.util.Scanner;
   
public class UppercaseByNumber{
   public static void main(String[] args){
      String word = "";
      int number;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Please enter a word: ");
      word = input.nextLine();
      System.out.print("Please enter a number: ");
      number = input.nextInt();
      System.out.println();
      
      for(int i = 0; i < number; i++) //repeat until i = number
         System.out.println(word.toUpperCase()); //print word in all caps
   }
}