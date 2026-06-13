import java.util.*;
public class problem45{
    public static void palindrome(int num){
        int r=num;
    int n=0;
    int rev=0;
    while(num>0){
        n=num%10;
        num=num/10;
        rev=rev*10+n;
    }
    if(r==rev){
        System.out.println("palindrome");
    }else{
        System.out.println("not palindrome");
    }

    }
    public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.print("enter a number");
    int num=sc.nextInt();
    palindrome(num);
    sc.close();
    }
}
