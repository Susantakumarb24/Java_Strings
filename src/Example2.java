import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int i, n1, n2, n3,max=0,num;
        for (i = 0; i < len-2; i++) {

            n1=str.charAt(i)-48;
            n2=str.charAt(i+1)-48;
            n3=str.charAt(i+2)-48;
            num= (n1 * 100 + n2 * 10 + n3);
             if(num>max)
                 max=num;
        }

        System.out.println(max);
    }
}
