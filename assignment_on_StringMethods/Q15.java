package assignment_on_StringMethods;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        int lastIndex;
        
        System.out.println("enter the word");
        String word = scan.next();

        
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("cat",lastIndex);

            if(lastIndex != -1)
            {
                countOfCats ++;
                lastIndex += "cat".length();
            }
        }

   
        lastIndex=0;
        while(lastIndex != -1)
        {
            lastIndex = word.indexOf("dog",lastIndex);

            if(lastIndex != -1)
            {
                countOfDogs ++;
                lastIndex += "dog".length();
            }
        }

        if(countOfCats==countOfDogs)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
