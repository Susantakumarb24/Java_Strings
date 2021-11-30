import java.util.Scanner;

public class CaseChange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //  int i;
        System.out.println("Enter the String : ");
        String s1=sc.nextLine();
        sc.close();
        long start=System.currentTimeMillis();
        //APPROACH-1
        StringBuilder s2= new StringBuilder();
        //sc.close();
        for (int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)>='a' && s1.charAt(i)<='z')
                s2.append((char) (s1.charAt(i) - 32));
            else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
                s2.append((char) (s1.charAt(i) + 32));
            else
                s2.append(s1.charAt(i));
        }
        System.out.println(s2);
        long end=System.currentTimeMillis();
        long tt=end-start;
        System.out.println("Time Taken : "+tt);
    }
}
