import java.util.Scanner;
public class AreaOfCircle{  
   public static void main(String[] arg) {    
      Scanner keyboard = new Scanner(System.in);    
      System.out.print("Please type the radius: ");    
      double rad = keyboard.nextDouble(); 
      double area = calcArea(rad); //calls calcArea() method, assigns to area
      //Returns area with two decimal places
      System.out.printf("The area of a circle with radius " + rad 
                       + " is: %.2f", area);
  }

   public static double calcArea(double rad){
      return (Math.PI * Math.pow(rad, 2)); //area = Pi*r^2, so it finds it
   }
}
      