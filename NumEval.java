public class NumEval{
   public static void main(String[] args){
      int x = 2;
      int y = 4;
      
      //The following calculates everything, and displays the answer
      System.out.println("0 * 0 + 1 --> " + (0 * 0 + 1));
      System.out.println("8 * (0 + 1) --> " + (8 * (0 + 1)));
      System.out.println("2 == x / y * 2 --> " + (2 == x / y * 2));
      System.out.println("2 == x / y * 2 -->  " + (2 == x / y * 2	));
      System.out.println("3 + 4 > 5 || 3 < 15 / 4 --> " + (3 + 4 > 5 || 3 < 15 / 4));
      System.out.println("! (3 >= 3) --> " + (! (3 >= 3)));
      System.out.println("1 == x || true --> " + (1 == x || true));
      System.out.println("1 < x && x < y --> " + (1 < x && x < y));
      System.out.println("1 + 1 + 2 == 4 && 2 * 3 != 6 --> " + (1 + 1 + 2 == 4 && 2 * 3 != 6));
      System.out.println("!(45>87||60/10!=5)&&6!=7 --> " + (!(45>87||60/10!=5)&&6!=7));
   }
}