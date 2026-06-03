import java.util.*;
public class problem27{
    public static int Sum(int n){
        if(n==0){
            return 0;
        }
        
        int add=Sum(n/10);
        int total=add+(n%10);
        return total;
        

    }
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int num=sc.nextInt();
        System.out.println(Sum(num));

        sc.close();

    }
}