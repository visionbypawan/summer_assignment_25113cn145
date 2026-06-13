import java.util.*;
public class problem41{
    public static void sum(int n1,int n2){
        int add=n1+n2;
        System.out.print(add);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        sum(num1,num2);
        sc.close();
        
        
    }
}