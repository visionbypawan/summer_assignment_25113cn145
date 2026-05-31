import java.util.Scanner;

public class probelm15 {
    public static void calcamst(int n){
        int count=0;
        int num;
        int n1=n;
        int n2=n;
        int ams=0;
        while(n>0){
            n=n/10;
            count++;
        }
        while(n1>0){
            num=n1%10;
            n1=n1/10;
            ams=ams+(int)Math.pow(num ,count );

        }
        if(n2==ams){
            System.out.println("amstrong number");
        }else{
            System.out.println("not amstrong");
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        calcamst(num);
        sc.close();
        
    }
}
