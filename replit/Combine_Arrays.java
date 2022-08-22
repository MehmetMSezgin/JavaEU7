package replit;

//Finish the **combineRs** method to combine the two given String arrays into one arraylist and return the arraylist.
//
//      for example:
//
//      ```
//      combineRs(["f","o","o"],[" b","a","r"])
//
//      returns [f, o, o, b, a, r]
//      ```
//
//      ```
//      combineRs(["1","2","3"],["4"])
//
//      returns [1, 2, 3, 4]
//      ```

import java.util.*;

public class Combine_Arrays {
  public static ArrayList<String> combineRs(String[] r1,String[] r2){
     
      ArrayList<String> newArrayList = new ArrayList<String>();

      for(String element: r1)
      {
          newArrayList.add(element);
      }

      for(String element: r2)
      {
          newArrayList.add(element);
      }

      return newArrayList;

  }

  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Enter first array's size");
      String [] array1 = new String[in.nextInt()];

      System.out.println("Enter second array's size");
      String [] array2 = new String[in.nextInt()];
      
      in.next();
     
      for(int i=0; i < array1.length; i++) {
          array1[i] = in.next();
      }
      for(int i=0; i < array2.length; i++) {
          array2[i] = in.next();
      }
      
      System.out.println("first array's size= " +array1.length);
      System.out.println("second array's size= " +array2.length);

      System.out.println(combineRs(array1,array2));

  }

}

