import java.util.*;
public class problem20{
    public static void primenum(int n){
        int largestprime=1;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                boolean prime=true;
                for(int j=2;j<i;j++){
                    if(i%j==0){
                        prime=false;
                        break;
                    }
                }
                if(prime){
                    largestprime=i;
                }
            }
        }
        System.out.println("largest prime is "+largestprime);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=sc.nextInt();
        primenum(n);
        sc.close();
    }
}