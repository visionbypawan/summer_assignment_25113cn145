import java.util.*;
public class problem42{
    public static void max(int n1,int n2){
        if(n1>n2){
            System.out.print(n1+"is maximum");
        }else{
            System.out.print(n2+"is maximum");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        max(num1,num2);
        sc.close();
        
        
    }
}