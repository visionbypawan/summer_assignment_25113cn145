import java.util.Scanner;

public class problem9 {
    public static void primenum(int n){
        boolean isprime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isprime=false;
                break;
            }
        }
        if(isprime==true){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        primenum(num);
        sc.close();

    }
}
