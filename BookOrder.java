import java.util.Scanner; // import scanner class

public class BookOrder{
   public static void main(String[] args){
      int numBooks, location;
      double sum = 0;
      double cost, orderFee, total, locationFee;
      Scanner input = new Scanner(System.in); //declare scanner variable
      
      //prompt user for # of books, assign to 'numBooks'
      System.out.print("Enter the number of books you are buying: ");
      numBooks = input.nextInt();
      
      /*For when i is less than or equal to the number of books, program
      will ask for the price of each book and calculate a sum*/
      for(int i = 1; i <= numBooks; i++){
         System.out.print("Enter the cost for book " + i + ": $");
         cost = input.nextDouble();
         sum = sum + cost;
      }
      
      System.out.print("Where do you want to ship the order?" +
                       "\nEnter 1 to ship within Canada," +
                       "\nEnter 2 to ship to the US," +
                       "\nEnter any other number to ship to an " +
                       "International location: ");
      location = input.nextInt();
      
      //Calculates cost of shipping
      if(location == 1)
         locationFee = 0;
      else if(location == 2)
         locationFee = 25;
      else
         locationFee = 50;
      
      //calculates the order fee depending on price of product
      if(sum < 50)
         orderFee = sum * 0.05;
      else if(sum >= 50 && sum <= 100)
         orderFee = sum * 0.15;
      else
      orderFee = sum * 0.25;
      
      //displays total cost of books (sum), orderFee and locationFee
      System.out.println("\nTotal cost for the books: $" + sum +
                         "\nShipping Fee based on order amount: $" + orderFee +
                         "\nShipping Fee based on location: $" + locationFee);
                         
      total = sum + orderFee + locationFee; //calculates total
      
      //displays total cost of books with shipping
      System.out.print("\nTotal cost with shipping: $" + total);
   }
}
      