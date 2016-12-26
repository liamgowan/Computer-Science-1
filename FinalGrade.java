import java.util.Scanner; //imports scanner class

public class FinalGrade{
   public static void main(String[] args){
      double exam, assignment, lab, finalGrade; // declares double variables
      String name; //declares string variable
      
      Scanner input = new Scanner(System.in); //delcares scanner variable
      
      /*The following prompts user to enter marks, and assigns
      them to their respective variable*/
      
      System.out.print("Please enter your name: ");
      name = input.nextLine();
      System.out.print("Please enter your exam mark: ");
      exam = input.nextDouble();
      System.out.print("Please enter your assignment mark: ");
      assignment = input.nextDouble();
      System.out.print("Please enter your lab mark: ");
      lab = input.nextDouble();
      
      //Calculates final grade
      finalGrade = exam * 0.30 + assignment * 0.50 + lab * 0.20;
      
      //Displays final grade
      System.out.print("Final grade: " + finalGrade + "%");
   }
}