import java.util.Scanner;

public class LengthWidthDemo
{
   public static void main(String[] args){
      Rectangle box = new Rectangle();
      double l,wi;
      Scanner input = new Scanner(System.in);
      
      System.out.print("The length is: ");
      l = input.nextDouble();
      
      System.out.print("The width is: ");
      wi = input.nextDouble();
      
      box.setLength(l);
      box.setWidth(wi);
      
      System.out.println("The box has a length of " + box.getLength());
      System.out.println("The box has a width of " + box.getWidth());
      System.out.println("The box has an area of " + box.getArea());
   }
}      