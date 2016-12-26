public class Triangle{
   public static void main(String[] args){
      for(int i = 1; i<=8; i++){//8 interations
         if(i%2 != 0) //if 8 is divisible by 2, make ascending triangle
            ascendingTriangle();
         else
            descendingTriangle();// otherwise, descending
      }
   }
   
   public static void ascendingTriangle(){
      for(int i=1; i<=5; i++){ //counts for 5 intervals
         for(int j=5; j>=0; j--){ //counts for 5 intervals
            if(j >= i) //if j is greater than i, place a space
               System.out.print(" ");
            else //other wise make "*" shape
               System.out.print("*");
          }
         System.out.println(); //prints space
      }
   }
   
   public static void descendingTriangle(){
      for(int i=1; i<=5; i++){//counts for 5 intervals
         System.out.print("     ");
         for(int j=5; j>=i; j--)//has intervals while j is >= to i
            System.out.print("*");
         System.out.println();
      }
   }
}