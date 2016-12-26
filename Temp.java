public class Temp{
   public static void main(String[] args){
      
      double fahrenheit, celsius = 32;
      //To convert celsius to fahrenheit, use the formula F = (C * 9/5) + 32
      fahrenheit = (celsius * 9/5) +32;
      System.out.println(celsius + " C = " + fahrenheit + " F");
      //Celsius changed to 12 C
      celsius = 12;
      fahrenheit = (celsius * 9/5) +32;
      System.out.println(celsius + " C = " + fahrenheit + " F");
      //celsius changed to 5
      celsius = 25;
      fahrenheit = (celsius * 9/5) +32;
      System.out.println(celsius + " C = " + fahrenheit + " F");
   }
}