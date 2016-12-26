import java.util.Scanner;

public class CharPrinter{
   public static void main(String[] args){
      int num = 0;
      Scanner input = new Scanner(System.in);
      //Prompts for & assigns int & char variables
      System.out.print("Enter a number: ");
      num = input.nextInt();      
      System.out.print("Enter a char: ");
      char ch1 = input.next().charAt(0);
      System.out.print("Enter a char: ");
      char ch2 = input.next().charAt(0);
      printChars(num, ch1, ch2);//calls printChars methof
   }
   
   public static void printChars(int num, char ch1, char ch2){
      /*outside for loop prints while i is less than or equal to
      num. It must be 'or equal to' so that it will print the 
      last line of entirely 'ch2'*/
      for(int i=0; i<=num; i++){
         /*will print a symbol for 'num' value of times.
         if j (num) is greater than i, it will print 'ch1',
         otherwise ch2. */
         for(int j=num; j>0; j--){
            if(j>i)
               System.out.print(ch1);
            else
               System.out.print(ch2);
         }
         System.out.println(); //prints line
      }
   }
}