//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st string: ");
        String s1=sc.nextLine();
        System.out.println("Enter 2nd string: ");
        String s2=sc.nextLine();
        sc.close();
        long start=System.currentTimeMillis();
        if(s1.length()!=s2.length())
        {
            System.out.println("not ANAGRAM");
        }
        else
        {
            char []ch1=s1.toCharArray();
            char []ch2=s2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2) == true) {
                System.out.println("Both the strings are anagram");
            }
            else {
                System.out.println("Both the strings are not anagram");
            }
        }
        long end=System.currentTimeMillis();
        System.out.println("Time Taken : "+(end-start));
    }
}
