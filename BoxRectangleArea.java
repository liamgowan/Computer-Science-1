import java.util.Scanner;//imports scanner class

public class BoxRectangleArea{
   public static void main(String[] args){
      double height, length, area; //declares double variables
      Scanner input = new Scanner(System.in); //declares scanner variable
      String shape = "square";   //declares string variable
      
      //prompts user for box height, assigns to 'height'
      System.out.print("Enter the height of the box: ");
      height = input.nextDouble();
      
      //prompts user for box length, assigns to 'length'
      System.out.print("Enter the length of the box: ");
      length = input.nextDouble();
      
      area = height * length; //calculates area
      
      if(height == length) //make shape a square if height = length
         shape = "square";
      else
         shape = "rectangle"; //make shape a rectangle if height = length
      
      //print box height, length, shape and area
      System.out.print("The box of " + height + " x " + length + " is a "
                       + shape + " and has the area of " + area);
   }
}
    
   
   
   