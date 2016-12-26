import javax.swing.JOptionPane; //Imports JOptionPane class

public class FToCPopUp{
   public static void main(String[] args){
      double celsius, fahrenheit; //declares double variables
      //Prompts user for temperature in F
      String input = JOptionPane.showInputDialog("Please type the temperature" + 
                                                 " in Fahrenheit:");
      fahrenheit = Double.parseDouble(input); //converts string to double
      celsius = (fahrenheit - 32)/1.8;        //converts F to C
      //Displays pop up window with conversion
      JOptionPane.showMessageDialog(null, "A " + fahrenheit + " in Fahrenheit is " +
                                  celsius + " degrees in Celsius.");
      System.exit(0); //exits
   }
}
      
      
