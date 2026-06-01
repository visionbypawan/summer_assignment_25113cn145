import java.util.*;      //perfect number is the sum of number those are divisor (except it self and include 1)
public class problem17{
    public static void perfectnum(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("perfect number");
        }else{
            System.out.println("not perfect number");
        }


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int n=sc.nextInt();
        perfectnum(n);
        sc.close();
        
    }
}