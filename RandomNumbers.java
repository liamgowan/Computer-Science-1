import java.util.Random; //imports random class

public class RandomNumbers{
   public static void main(String[] args){
      int count = 0;
      System.out.println("Welcome! Here are 10 random numbers between 1 and 100:");
      
      //prints 10 random numbers
      while(count < 10){
         Random rannum = new Random();
         int number = rannum.nextInt(100); // assigns a random integer between 1-100 to number
         System.out.print(number + " ");
         count++;
      }
   }
}
      
      
      