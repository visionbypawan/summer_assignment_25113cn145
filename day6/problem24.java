import java.util.Scanner;

public class problem24 {
    public static void pow(int x,int n){
        int power=1;
        for(int i=0;i<n;i++){
            power*=x;
        }
        System.out.println(power);
        


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        int x=sc.nextInt();
        pow(x,n);
        sc.close();
    }
}
