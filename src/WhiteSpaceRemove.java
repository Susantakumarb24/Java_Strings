import java.util.Scanner;

public class WhiteSpaceRemove {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=sc.nextLine();
        s1=s1.replaceAll(" ","");
        System.out.println(s1);
    }
}
