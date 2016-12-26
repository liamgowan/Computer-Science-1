import java.util.Scanner; //import scanner class

public class ClassMark{
   public static void main(String[] args){
      double first, second, average; //declare double variables
      Scanner input = new Scanner(System.in); //declares scanner variable
      
      //prompts user for first mark, assigns to first
      System.out.print("Please type the first mark out of 15: ");
      first = input.nextDouble() / 15;
      
      //prompts user for second mark, assigns to second 
      System.out.print("Please type the second mark out of 45: ");
      second = input.nextDouble() / 45;
      
      average = ((first + second) / 2) * 100; //calculates average
      
      System.out.println("Your average is: " + average + "%"); //displays average
      
      if(average > 80) //if average is greater than 80, it says you're doing well
         System.out.print("You are doing fine.");
      else{ //other wise it'll tell you to get help
         System.out.print("You should go to the learning centre to get "
                          + "some extra help.");
      }
   }
}                          
                          
      
      