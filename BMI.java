import java.util.Scanner; //imports Scanner class

public class BMI{
   public static void main(String[] args){
      double weight, height, BMI; //declares double variables
      Scanner input = new Scanner(System.in); //declares Scanner variable
      
      /*The following prompts user for weight and height, and 
      assigns values to respective variables
      */
      
      System.out.print("Enter your weight in kilograms: ");  
      weight = input.nextDouble();
      System.out.print("Enter your height in metres: ");
      height = input.nextDouble();
      
      BMI = weight / Math.pow(height, 2); //calculates BMI
      
      System.out.print("\nYour BMI is " + BMI+"."); //Displays BMI
      
      /*The following determines if BMI is less than 18.5, between 18.5 and 24.9,
      or greater than or equal to 25. Based on the BMI, the program
      tells user what they should do.
      */
      
      if(BMI < 18.5) 
         System.out.print(" This is low. You should consider gaining weight.");
      else if(BMI >= 18.5 && BMI <= 24.9)
         System.out.print(" This is normal. Keep on going with your healthy lifestyle.");
      else if(BMI >= 25)
         System.out.print(" This is high. You should consider losing weight"); 
   }
}