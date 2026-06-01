//A Strong Number is a number whose sum of the factorials of its digits is equal to the number itself.
import java.util.*;
public class problem18{
    public static void strongnum(int n){
        int n1=n;
        int n2=n;
        int sum=0;
        while(n>0){
            n1=n%10;
            n=n/10;
            int fact=1;
            for(int i=1;i<=n1;i++){
                fact*=i;

            }
            sum+=fact;
        }
        if(sum==n2){
            System.out.println("strong number");
        }else{
            System.out.println("not strong");
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        strongnum(n);
        sc.close();
        
    }
}
