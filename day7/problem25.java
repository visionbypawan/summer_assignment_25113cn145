import java.util.*;
public class problem25{
    public static int Factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=Factorial(n-1);
        int fn=n*fnm1;
        return fn;

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        System.out.println(Factorial(num));

        sc.close();

    }
}