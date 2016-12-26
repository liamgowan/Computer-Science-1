import java.util.Scanner; // imports scanner class

public class Flight{
   public static void main(String[] args){
      int code;
      Scanner input = new Scanner(System.in);
      
      //Asks user for flight code, saves to code
      System.out.print("Please input the flight code: ");
      code = input.nextInt();
      
      //Figures out which response to output
      if(code == 123)
         System.out.print("This flight goes from Halifax to Toronto");
      else if(code == 232)
         System.out.print("This flight goes from Vancouver to Edmonton");
      else if(code == 322)
         System.out.print("This flight goes from Toronto to Ottawa");
      else if(code == 418)
         System.out.print("This flight goes from St. John's to Calgary");
      else
         System.out.print("Not valid input.");
   }
}