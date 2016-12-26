public class ForPattern{
   public static void main(String[] args){
      //prints i * 3, where i increases by 1 per interation for 10 interations
      for(int i = 1; i <=10; i++)
         System.out.print(i * 3 + " ");
      
      System.out.println();
      
      //prints i, where i decreases by 1 per interation for 10 interations
      for(int i = 9; i >= 0; i--)
         System.out.print(i + " ");
      
      System.out.println();
      
      //prints i, where i increases by 2 per interation for 10 interations
      for(int i = 1; i <= 19; i = i + 2)
         System.out.print(i + " ");
      
      System.out.println();
      
      //prints i, where i increases by 2 per interation for 10 interations
      for(int i = 0; i <= 18; i = i + 2)
         System.out.print(i + " ");
      
      System.out.println();
      
      //prints i , where i decreases by 2 per interation for 10 interations
      for(int i = 18; i >= 0; i = i - 2)
         System.out.print(i + " ");
   }
}