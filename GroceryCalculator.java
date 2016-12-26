import java.util.Scanner; //imports scanner class

public class GroceryCalculator{
   public static void main(String[] args){
      //delcares double variables
      double a, b, c, costBeforeTax, taxRate, salesTax, amountPayable; 
      
      Scanner input = new Scanner(System.in); //declares input as scanner variable
      
      //the following prompts user for prices and assigns to a, b and c.
      System.out.print("Please type in the cost of item 1: "); 
      a = input.nextDouble();
      System.out.print("Please type in the cost of item 2: ");
      b = input.nextDouble();
      System.out.print("Please type in the cost of item 3: ");
      c = input.nextDouble();
      
      costBeforeTax = a + b + c; //calculates cost before cost
      
      System.out.print("Please type the tax rate: "); //prompts user for tax rate
      taxRate = input.nextDouble();                   //assigs input to taxRate
      
      salesTax = costBeforeTax * taxRate;             //Calculates sales tax
      
      amountPayable = costBeforeTax + salesTax; //Calculates total
      
      //The following displays amount before tax, tax, and total.
      System.out.println("\nCost before tax: " + costBeforeTax);
      System.out.println("Sales Tax: " + salesTax);
      System.out.print("Total Amount: $" + amountPayable);
   }
}  