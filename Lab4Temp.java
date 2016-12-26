import javax.swing.JOptionPane; //imports JOptionPane method

public class Lab4Temp{
   public static void main(String[] args){
      double celsius, fahrenheit; //declares double variables
      //Prompts user for temperature, assigns it to tempInput
      String tempInput = JOptionPane.showInputDialog("Please type the " + 
                                                 "temperature in Fahrenheit:");
      fahrenheit = Double.parseDouble(tempInput); //converts string to double
      celsius = (fahrenheit - 32) / 1.8; //converts F to C
      
      //Displays a pop up window showing conversion
      JOptionPane.showMessageDialog(null, fahrenheit + " in Fahrenheit " +
                                    "is " + celsius + " degrees in Celsius");
   }
}
                                                   
                                                   