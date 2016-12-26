public class Test1{
   public static void main(String[] args){
      int a = 0;
      int [] b = {0};
      change(a);
      System.out.print(a);
   }
   public static void change(int a){
      a = 10;
   }
   public static void change(int b){
      b[0] = 10;
   }
   
}