import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        in.nextLine();

        for (int i = 0; i < n; i++) 
        {
            String s = in.nextLine();
            char[] charArray = s.toCharArray();

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");


            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        in.close();
    
        
        // Solution in c++
        // int x = in.nextInt();
        // for(int i = 0; i < x; i++){
        //     String s = in.nextLine();
        //     String arr[]=new String[s];
        //     String s1, s2;
        //     for(int j = 0; j <= i; j++){
        //         if(j % 2 == 0){
        //             s1 += arr[j];
        //         }
        //         else{
        //             s2 += arr[j];
        //         }
        //     }
        //     System.out.println(s1 +"  "+ s2);
        //     in.close();
        // }
        
    }         
}

