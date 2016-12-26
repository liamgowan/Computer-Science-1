public class ArraySum{
   public static void main(String[] args){
      /*As specified in instructions, two arrays have been made 
      without asking for user input */
      int[] array1 = {82, 4, 16, 34};
      int[] array2 = {41, 2, 8, 17};
      System.out.print("Array 1: ");
      for(int i=0; i<array1.length; i++) //lists numbers in array1
         System.out.print(array1[i] + " ");
      System.out.println();
      System.out.print("Array 2: ");
      for(int i=0; i<array2.length; i++) //lists numbers in array2
         System.out.print(array2[i] + " ");
      System.out.println("\n\nThe sum of numbers in array1 and array 2 are: ");
      for(int i=0; i<array1.length; i++){ //adds numbers, shows result
         System.out.println(array1[i] + " + " + array2[i] + " = " +
                           (array1[i] + array2[i]));
      }
   }
}