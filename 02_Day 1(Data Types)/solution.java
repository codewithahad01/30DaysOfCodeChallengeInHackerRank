import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner in = new Scanner(System.in);
       int integ = in.nextInt();
       double doub = in.nextDouble();
       String str = "";
       in.nextLine();
       str = in.nextLine();
       
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        System.out.println(i + integ);
        System.out.println(d + doub);
        System.out.println(s + str);
    }
}

