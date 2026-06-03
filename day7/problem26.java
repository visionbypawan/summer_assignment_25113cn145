import java.util.*;
public class problem26{
    public static int Fibonacci(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1=Fibonacci(n-1);
        int fnm2=Fibonacci(n-2);
        int fn=fnm1+fnm2;
        return fn;

        

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        System.out.print(Fibonacci(num));
        

        sc.close();

    }
}