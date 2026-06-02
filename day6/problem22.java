import java.util.Scanner;

public class problem22 {
    public static void Bintodeci(int n){
        int pow=0;
        int dec=0;
        while(n>0){
            int lstdigit=n%10;
            dec=dec+(lstdigit*(int)Math.pow(2,pow));
            pow++;
            n=n/10;

        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        Bintodeci(num);
        sc.close();
    }
}
