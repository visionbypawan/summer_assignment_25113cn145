import java.util.Scanner;

public class problem46 {
    public static void calcamst(int n){
        int num;
        int i;
        for(i=0;i<=n;i++){
            int temp=i;
            int n1=i;
            int n2=i;
            int count=0;
            int ams=0;
            while(temp>0){
            temp=temp/10;
            count++;
            }
            while(n1>0){
            num=n1%10;
            n1=n1/10;
            ams=ams+(int)Math.pow(num ,count );
            }
            if(n2==ams){
             System.out.println(ams);
            }

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