import java.util.*;
public class problem28{

    public static int reverse(int n,int rev){
        if(n==0){
            return rev;
        }
        int r=rev*10+n%10;
        return reverse(n/10,r);
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        System.out.println(reverse(num,0));
        sc.close();
    }
}