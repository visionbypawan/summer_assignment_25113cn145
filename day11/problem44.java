import java.util.*;
public class problem44{
    public static void factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
            
        }
        System.out.println("factorial is "+fact);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        factorial(num);
        sc.close();
        
        
    }
}