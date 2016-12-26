import java.util.Scanner;//imports scanner class

public class WhatShouldIWear{
   public static void main(String[] args){
      double temp; //declares double variable
      Scanner input = new Scanner(System.in); //declares scanner variable
      
      //prompts user for temp, assigns to temp
      System.out.print("Enter the temperature: ");
      temp = input.nextDouble();
      
      /*The following nested if statements test to see if the
      temperature is greater than 30, greater than 25 but less than
      30, greater than 20 but less than 25, greater than 15 but 
      less than 20, greater than 10 but less than 15, or between 0 and 10.
      It will then print what you should wear.
      */
      if(temp >= 30){
         System.out.print("It is really hot - stay indoors");
      }
         else{
            if (temp >= 25 && temp < 30){
               System.out.print("Wear sunscreen and a hat");
         }
               else{
                  if (temp >= 20 && temp < 25){
                     System.out.print("You won't need a sweater today");
               }
                     else{
                        if (temp >= 15 && temp < 20){
                           System.out.print("You will need a sweater today");
                     }
                           else{
                              if (temp >= 10 && temp < 15){
                                 System.out.print("You should take a jacket");
                              }
                                 else{
                                    if(temp > 0 && temp < 10){
                                    System.out.print("Wear a hat and mittens");
                                    }   
                                 }
                          }
                     }
               }
         }
   }
}
                  