import java.util.Scanner;

public class problem10 {
    public static void primenum(int n){
        for(int i=2;i<=n;i++){
            boolean isprime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isprime=false;
                    break;
                }

            }
            if(isprime==true){
                System.out.println(i);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        primenum(num);
        sc.close();
        
    }
    
}
