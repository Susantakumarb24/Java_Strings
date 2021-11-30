import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
// some time passes

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        sc.close();
        int i,count=0;
        for(i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                count++;
        }

        System.out.println("Total Characters are = "+count);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
