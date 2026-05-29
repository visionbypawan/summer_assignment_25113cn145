import java.util.*;
public class problem7{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("enter a number");
    int num=sc.nextInt();
    int prod=1;
    int n=0;
    while(num>0){
        n=num%10;
        num=num/10;
        prod*=n;

    }
    System.out.println(prod);
    sc.close();
}
} 
    

