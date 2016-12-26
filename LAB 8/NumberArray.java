import java.util.Scanner;

public class NumberArray{
   public static void main(String[] args){
      int numLength;
      Scanner input = new Scanner(System.in);
      
      /*prompts user for number between 5 and 10, if it is not,
      the while loops will asks user for another number */
      
      System.out.print("Enter a number between 5 and 10: ");
      numLength = input.nextInt();
      while(numLength < 5 || numLength > 10){
         System.out.print("Error: Number not between 5 and 10." +
                          "\nEnter a number that is: ");
         numLength = input.nextInt();
      }
      //creates array called nums with length of numLength
      int nums[] = new int[numLength];
      System.out.print("Enter in " + numLength + " numbers: ");
      
      //assings input to position in array
      for(int i=0; i<numLength; i++)
         nums[i] = input.nextInt();
      
      //shows numbers in array
      System.out.print("\nThe numbers in array nums are: ");
      for(int i=0; i<numLength; i++)
         System.out.print(nums[i] + " ");
          
      //shows largest number in array
      System.out.print("\nThe largest number is: ");
      int largestNumber = 0;
      for(int i = 0; i<numLength; i++){
         if(largestNumber<nums[i])
            largestNumber = nums[i];
         if(i == numLength-1)
            System.out.print(largestNumber);
      }
      
      //shows & calculates average of numbers in array
      System.out.print("\nThe average of the numbers is: ");
      double sum = 0;
      for(int i = 0; i<numLength; i++){
         sum += nums[i];
         if(i == numLength-1){
            double average = sum/numLength;
            System.out.printf("%.1f", average);
         }
      }
   }
}