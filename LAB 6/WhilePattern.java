public class WhilePattern{
   public static void main(String[] args){
      int i = 1;
      //prints i * 3 where i increases by 1 per interation, for 10 interations
      while(i <= 10){
         System.out.print(i * 3 + " ");
         i++;
      }
      
      System.out.println();
      
      //prints i - 1 where i decreases by 1 per interation, for 10 interations
      i = 10;
      while(i > 0){
         System.out.print(i - 1 + " ");
         i--;
      }
      
      System.out.println();
      
      //prints i where i increases by 2 per interation, for 10 interations
      i = 1;
      while(i <= 19){
         System.out.print(i + " ");
         i = i + 2;
      }
      
      System.out.println();
      
            System.out.println();

      //prints i where i increases by 2 per interation, for 10 interations
      i = 0;
      while(i <= 18){
         System.out.print(i + " ");
         i = i + 2;
      }
      
      System.out.println();
      
      //prints i where i decreases by 2 per interation, for 10 interations
      i = 18;
      while(i >= 0){
         System.out.print(i + " ");
         i = i - 2;
      }
   }
}