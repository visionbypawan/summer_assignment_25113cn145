import java.util.*;
public class problem6{
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("enter a number");
    int num=sc.nextInt();
    int rev=0;
    int n=0;
    while(num>0){
        n=num%10;
        num=num/10;
        rev=rev*10+n;
        

    }
    System.out.println(rev);
    sc.close();
}
}
