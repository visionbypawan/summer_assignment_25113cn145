import java.util.Scanner;

public class problem21 {
    public static void Decitobin(int n){
        int pow=0;
        int bin=0;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            pow++;
            n=n/2;

        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        Decitobin(num);
        sc.close();
    }
}
