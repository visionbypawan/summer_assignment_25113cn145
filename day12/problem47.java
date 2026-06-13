import java.util.*;
public class problem47{
    public static void fibonacci(int n){
        System.out.println("0");
        System.out.println("1");
        int presum=0;
        int secsum=1;
        for(int i=0;i<=n-3;i++){
            int temp=presum+secsum;
            presum=secsum;
            secsum=temp;
            System.out.println(secsum);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        fibonacci(n);
        sc.close();
        
    }
}