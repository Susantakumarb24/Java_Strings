import java.util.Scanner;

public class DivideString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=sc.nextLine();
       // s1=s1.replaceAll(" ","");
       // System.out.println(s1);
        System.out.println("how many parts you want: ");
        int n= sc.nextInt();
        int rem=s1.length()/n,ind=0;
        String []str=new String[n];
        if(s1.length()%n!=0)
        {
            System.out.println("Can not divide.....");
            System.exit(0);
        }
        else
        {
            for (int i=0;i<s1.length();i=i+rem)
            {
                str[ind]=s1.substring(i,i+rem);
                ind++;
            }
        }
        System.out.println("divided strings rae : ");
        for(int i=0;i<n;i++)
        {
            System.out.println(str[i]);
        }


    }
}
