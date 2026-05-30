import java.util.Scanner;

public class problem12 {
    public static int Gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcdvalue=Gcd(a,b);
        int Lcm=(a*b)/gcdvalue;                              // here gcdvalue contain copied value of a not actual value
        System.out.println("lcm is "+Lcm);
        sc.close();
        

    }
    
}