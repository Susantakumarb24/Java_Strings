import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CleverTap {
    public static void main(String[] args) throws IOException {
        BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the expression : ");
        String exp=input.readLine();
        int [] stack=new int[exp.length()];
        int top=-1;
        for(int i=0;i<exp.length();i++)
        {
            if(top==-1)
            {
                top++;
                stack[top]=exp.charAt(i);
            }
        }

    }
}
