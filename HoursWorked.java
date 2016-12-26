import javax.swing.JOptionPane; //imports JOptionPane class


public class HoursWorked{
   public static void main(String[] args){
      String emp1, emp2, emp3;
      //The following string variables have been initialized to display nothing
      String message1 = "";
      String message2 = "";
      String message3 = "";
      String maxPerson = "";
      String minPerson = "";
     
      double hrs1, hrs2, hrs3, maxVal, minVal;
      
      
      /*The following code prompts user for name of each employee and the 
      number of hours each has worked, and assigns value to respective 
      variable */
      
      emp1 = JOptionPane.showInputDialog("Please type name of Employee 1");
      hrs1 = Double.parseDouble(JOptionPane.showInputDialog("Please type the" 
                              + " hours of " + emp1));
      emp2 = JOptionPane.showInputDialog("Please type name of Employee 2");
      hrs2 = Double.parseDouble(JOptionPane.showInputDialog("Please type the"
                              + " hours of " + emp2));
      emp3 = JOptionPane.showInputDialog("Please type name of Employee 3");
      hrs3 = Double.parseDouble(JOptionPane.showInputDialog("Please type the"
                              + " hours of " + emp3));  
      
      //calculates maximum value                        
      maxVal = Math.max(hrs1, hrs2);
      maxVal = Math.max(maxVal, hrs3);
      
      /*The following block of code determines if the program should tell the 
      user if only one employee worked the most amount of hours, or if multiple
      employee worked the same amount of hours*/
      if(hrs1 == hrs2 && hrs1 == hrs3 && hrs2 == hrs3)
         maxPerson = "Everyone has worked the same amount of hours: " + maxVal;
      else if(maxVal == hrs1 && maxVal != hrs2 && maxVal != hrs3)
         maxPerson = emp1 + " has worked the most amount of hours: " + maxVal;                  
      else if(maxVal == hrs2 && maxVal != hrs1 && maxVal != hrs3)
         maxPerson = emp2 + " has worked the most amount of hours: " + maxVal;
      else if(maxVal == hrs3 && maxVal != hrs1 && maxVal != hrs2)
         maxPerson = emp3 + " has worked the most amount of hours: " + maxVal;
      else if(hrs1 == hrs2 && hrs1 == hrs3 && hrs2 == hrs3)
         maxPerson = "Everyone has worked the same amount of hours: " + maxVal;
      else if(hrs1 == hrs2){
         maxPerson = emp1 + " and " + emp2 + " have tied for working the most "
                     + "amount of hours: " + maxVal;
      }
      else if(hrs1 == hrs3){
         maxPerson = emp1 + " and " + emp3 + " have tied for working the most "
                     + "amount of hours: " + maxVal;
      }
      else if(hrs2 == hrs3){
         maxPerson = emp2 + " and " + emp3 + " have tied for working the most "
                     + "amount of hours: " + maxVal;
      }
         
      //calculates minimum value 
      minVal = Math.min(hrs1, hrs2);
      minVal = Math.min(minVal, hrs3);
      
      /*The following block of code determines if the program should tell the 
      user if only one employee worked the most least of hours, or if multiple
      employee worked the same amount of hours*/
      if(hrs1 == hrs2 && hrs1 == hrs3 && hrs2 == hrs3)
         minPerson = "";
      else if(minVal == hrs1 && minVal != hrs2 && minVal != hrs3)
         minPerson = emp1 + " has worked the least amount of hours: " + hrs1;                  
      else if(minVal == hrs2 && minVal != hrs1 && minVal != hrs3)
         minPerson = emp2 + " has worked the least amount of hours: " + hrs2;
      else if(minVal == hrs3 && minVal != hrs1 && minVal !=hrs2)
         minPerson = emp3 + " has worked the least amount of hours: " + hrs3;
      else if(hrs1 == hrs2){
         minPerson = emp1 + " and " + emp2 + " have tied for working the least "
                     + "amount of hours: " + hrs1;
      }
      else if(hrs1 == hrs3){
         minPerson = emp1 + " and " + emp3 + " have tied for working the least "
                     + "amount of hours: " + hrs1;
      }
      else if(hrs2 == hrs3){
         minPerson = emp2 + " and " + emp3 + " have tied for working the least "
                     + "amount of hours: " + hrs2;
      }
      else if(hrs1 == hrs2 && hrs1 == hrs3 && hrs2 == hrs3)
         minPerson = "";
         
      /*All of the above else if statements are needed as it is vert possible 
      that multiple employees could be recieving the same amount of hours */
      
      
      /*The following code determines if each employee has worked overtime
      and if applicable by how much. It then makes a string message that
      indicates who worked how many hours overtime, which is used in the final 
      message */
         
      if(hrs1 > 40 ){
         double OT1 = hrs1 - 40;
         String SHour1 = "" + OT1;
         message1 = emp1 + " worked " + SHour1 + " hours overtime";
      }
      if(hrs2 > 40 ){
         double OT2 = hrs2 - 40;
         String SHour2 = "" + OT2;
         message2 = emp2 + " worked " + SHour2 + " hours overtime";
      }
      if(hrs3 > 40 ){
         double OT3 = hrs3 - 40;
         String SHour3 = "" + OT3;
         message3 = emp3 + " worked " + SHour3 + " hours overtime";
      }
      
      //Displays all information.
      JOptionPane.showMessageDialog(null, maxPerson + 
                                   "\n" + minPerson  + "\n" 
                                   + message1 + "\n" + message2 + "\n" + message3);
                                   
      System.exit(0);                       
    }
}
