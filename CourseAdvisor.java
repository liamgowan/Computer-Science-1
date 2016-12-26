import java.util.Scanner;//imports scanner class

public class CourseAdvisor{
   public static void main(String[] args){
      int year, major; //declares int variables
      Scanner input = new Scanner(System.in); //declares scanner variable
      
      //prompts user for year, and assigns value to year
      System.out.print("Enter 1 if you are a new student. " +
                       "Enter 2 if you are a second year student: ");
      year = input.nextInt();
      
      //prompts user for major and assigns value to major
      System.out.print("\nEnter 1 if your major is Computer Science. " +
                       "Enter 2 if your major is Psychology: ");
      major = input.nextInt();
      
      
      if(year == 1 && major == 1){
         //will print if user is in first year computer science
         System.out.print("\nYou need to take CSCI 1100 and CSCI 1101 " +
                          "in your first year.");
      }
      
      else if(year == 1 && major == 2){
         //will print if user in first year psychology
         System.out.print("\nYou need to take PSYO 1011 and PYSO 1021 " +
                          "in your first year.");
         }
      
      else if(year == 2 && major == 1){
         //will print if user is in second year computer science
         System.out.print("\nYou need to take CSCI 2110 " +
                          "in your second year.");
      }
      
      else if(year == 2 && major ==2){
         //will print if user in second year psychology
         System.out.print("\nYou need to take PSYO 2000 " +
                          "in your second year.");
      }
   }
}
                              