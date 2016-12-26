import java.util.Scanner; //imports Scanner class

public class Pairs{
   public static void main(String[] args){
      int num1, num2, num3, num4; //declares int variables
      Scanner input = new Scanner(System.in); //declares Scanner variable
      
      System.out.print("Input four numbers: "); //prompts user for four numbers
      num1 = input.nextInt();                   //assigns number to num1
      num2 = input.nextInt();                   //assigns number to num2
      num3 = input.nextInt();                   //assigns number to num3
      num4 = input.nextInt();                   //assigns number to num4
      
      System.out.print(num1 + " " +num2 + " "+ num3 + " " + num4); // Prints out the numbers
      
      //The following statements test to see if there are pairs in the four numbers
      
      /*If num1 is the same as num2 AND num1 is the same as num3 OR num1 is the 
      same as num4 OR num2 is the same as num3 OR if num2 is the same as num4
      OR if num3 is the same as num4, the program will print "Two Pairs".
      */
      if((num1 == num2) && (num1 == num3 || num1 == num4|| 
         num2 == num3 || num2 == num4 || num3 == num4))
            System.out.print("\t\tTwo Pairs");
            
      /*If num1 is the same as num3 AND num1 is the same as num2 OR num1 is the 
      same as num4 OR num2 is the same as num3 OR if num2 is the same as num4
      OR if num3 is the same as num4, the program will print "Two Pairs".
      */
      else if((num1 == num3) && (num1 == num2 || num1 == num4|| 
         num2 == num3 || num2 == num4 || num3 == num4))
            System.out.print("\t\tTwo Pairs");
     
     /*If num1 is the same as num4 AND num1 is the same as num3 OR num1 is the 
      same as num2 OR num2 is the same as num3 OR if num2 is the same as num4
      OR if num3 is the same as num4, the program will print "Two Pairs".
      */
      else if((num1 == num4) && (num1 == num2 || num1 == num3|| 
         num2 == num3 || num2 == num4 || num3 == num4))
            System.out.print("\t\tTwo Pairs");
      
      /*If num2 is the same as num3 AND num1 is the same as num3 OR num1 is the 
      same as num4 OR num1 is the same as num2 OR if num2 is the same as num4
      OR if num3 is the same as num4, the program will print "Two Pairs".
      */ 
      else if((num2 == num3) && (num1 == num2 || num1 == num4|| 
         num1 == num3 || num2 == num4 || num3 == num4))
            System.out.print("\t\tTwo Pairs");
            
      /*If num2 is the same as num4 AND num1 is the same as num3 OR num1 is the 
      same as num4 OR num2 is the same as num3 OR if num1 is the same as num3
      OR if num3 is the same as num4, the program will print "Two Pairs".
      */
      else if((num2 == num4) && (num1 == num2 || num1 == num4|| 
         num2 == num3 || num1 == num3 || num3 == num4))
            System.out.print("\t\tTwo Pairs");
      
       /*If num3 is the same as num4 AND num1 is the same as num3 OR num1 is the 
      same as num4 OR num2 is the same as num3 OR if num2 is the same as num4
      OR if num1 is the same as num3, the program will print "Two Pairs".
      */
         
      else if((num3 == num4) && (num1 == num2 || num1 == num4|| 
         num2 == num3 || num2 == num4 || num1 == num3))
            System.out.print("\t\tTwo Pairs");
       
       //If none of the conditions are true, print "Not Two Pairs"
       else
          System.out.print("\t\tNot Two Pairs");       
   }
}
