import java.util.*;
public class problem5{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("enter a number");
    int num=sc.nextInt();
    int sum=0;
    int n=0;
    while(num>0){
        n=num%10;
        num=num/10;
        sum+=n;

    }
    System.out.println(sum);
    sc.close();
}
}