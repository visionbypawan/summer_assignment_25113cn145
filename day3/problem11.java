//important
import java.util.Scanner;

public class problem11 {
    public static void Gcd(int a,int b){
        while(b!=0){
            int rem=a%b;
            a=b;
            b=rem;
        }
        System.out.println("gcd is"+a);
    }
    public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        Gcd(a,b);
        sc.close();
        

    }
    
}
// when b>a  eg b=36 and a=12
// 12%36=12
//rem =12%36
//a=b
//b=rem
// now a become 36 and b become 12