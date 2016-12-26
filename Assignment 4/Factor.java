import java.util.Scanner;

public class Factor{
   public static void main(String[] args){
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int num = input.nextInt();
      factors(num); //calls factors() method
      
   }
   
   public static void factors(int num){
      System.out.print("Factors: ");
      /*When i is less than or equal to num, the program will 
      test to see if the remainder of num/i is 0, and if it is 
      it will print i, the factor*/
      for(int i=1; i<=num; i++){
         if(num%i == 0){
            System.out.print(i + " ");
         }
      }
      
      /*While not required, this program will also display
      the two factors that multiply to give num in a way that
      is easier for the user to read, using commas to separate 
      the pairs 
      The outer for loop runs each interation while i is less 
      than or equal to num, and the inner for loop will run while j 
      less than or equal to i. The inner for loop checks to see
      if i*j is equal to num, and whether or not i is equal to num.
      If i*j = num, it will print j and i, and it will only place a
      comma if i does not equal num, meaning there are still more 
      numbers to test. */
      System.out.print("\n\nFactors given in pairs: ");
      for(int i=1; i<=num; i++){
         for(int j=1; j<=i; j++){
            if(i*j == num && i != num)
               System.out.print(j + " " + i + ", ");
            else if(i*j == num && i == num)
               System.out.print(j + " " + i);
            
         }
      }      
   }
}