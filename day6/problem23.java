import java.util.Scanner;

public class problem23{
    public static void countsetbits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        System.out.println(count);





    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a num:");
        int num=sc.nextInt();
        countsetbits(num);
        sc.close();
    }
}