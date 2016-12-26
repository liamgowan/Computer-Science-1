import javax.swing.JOptionPane; //imports JOptionPane method

public class AnotherCurrencyConverter{
   public static void main(String[] args){
      double cost, tax, salesTax, cadTotal, usdTotal; //declares double variables
      //prompts user for cost, converts string to double, assigns to cost
      cost = Double.parseDouble(JOptionPane.showInputDialog("Please type the " +
                                                            "cost of the item:"));
      //prompts user for tax, converts string to double, assigns to tax
      tax = Double.parseDouble(JOptionPane.showInputDialog("Please type the " +
                                                           "GST percantage rate:"))/100;
                                                           
      salesTax = cost * tax; //calculates tax
                                                           
      cadTotal = cost + salesTax; //calculates total
      
      usdTotal = cadTotal * 0.814; //converts total to USD
      
      //displays cost, tax, total, and total in USD
      JOptionPane.showMessageDialog(null, "Cost Cdn: $" + cost + " Plus Tax: $" + salesTax +
                                          "\nTotal: $" + cadTotal + " Cdn or in US$: " + usdTotal);
   }
}
       