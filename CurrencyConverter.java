public class CurrencyConverter{
   public static void main(String[] args){
      double CD = 10, eu, yen; //delcares variables
      converter(CD);
      
      CD = 250;
      converter(CD);
      
      CD = 1100;
      converter(CD); 
   }
   public static void converter(double CD) {
   double eu = CD * 0.74;
   double yen = CD * 99.32;  
   System.out.println(CD + " Canadian dollars = " + eu + " Euros = " + yen + " Yen");
   }
}

