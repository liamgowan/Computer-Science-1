import java.util.Scanner; //imports scanner class

public class CashierHelper{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); //creates scanner class variable, input
      int total, dollars, quarters, dimes, nickles, pennies, remainder; //declares variables
      //Declares string literals
      String dollar_S = "dollars"; String quarter_S = "quarters";
      String dime_S = "dimes"; String nickle_S = "nickles";
      String penny_S= "pennies";
      
      System.out.print("Enter an amount in cents: "); //Prompts user for monetary value
      total = input.nextInt();              //assigns input to total
      
      dollars = total/100;                  //Finds how many dollars are in total
      remainder = total - (dollars*100);    //Calculates remainder
      quarters = remainder/25;              //Finds how many quarter are in remainder
      remainder = remainder - (quarters*25);//Calculates remainder
      dimes = remainder/10;                 //Finds how many dimes are in remainder
      remainder = remainder - (dimes*10);   //Calculates remainder
      nickles = remainder/5;                //Finds how many nickles are in remainder
      remainder = remainder - (nickles*5);  //Calculates remainder
      pennies = remainder;                  //Makes pennies the remaining amount
      
      /*If there is only one coin (ex: one dollar), you would say "I have one
      dollar", not "I have one dollars". The following if statements ensure
      a proper string literal is used depending on if there is one or more coins.
      */
      if(dollars == 1){                     
         dollar_S = " dollar, ";
      }
      else if(dollars != 1){
         dollar_S = " dollars, ";
      }
      else if(quarters == 1){
         quarter_S = " quarter, ";
      }
      else if(quarters != 1){
         quarter_S = " quarters, ";
      }
      else if(dimes == 1){
         dime_S = " dime, ";
      }
      else if(dimes != 1){
         dime_S = " dimes, ";
      }
      else if(nickles == 1){
         nickle_S = " nickle, ";
      }
      else if(nickles != 1){
         nickle_S = " nickles, ";
      }
      else if(pennies == 1){
         penny_S = " penny.";
      }
      else if(pennies != 1){
         penny_S = " pennies.";
      }
      
      //The following prints the total, and easiest way to make change.
      System.out.print(total + " has " + dollars + dollar_S + quarters 
                       + quarter_S + dimes + dime_S + nickles
                       + nickle_S + "and " + pennies + penny_S);
   }
}