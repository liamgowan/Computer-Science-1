import java.util.Scanner;

public class Even{
   public static void main(String[] args){
      int integer, num;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter number: ");
      integer = input.nextInt();
      num = integer;
      integer = integer / 2;
      integer = integer * 2;
      
      if(integer == num)
         System.out.print("even");
      else
         System.out.print("odd");
   }
}
      
      