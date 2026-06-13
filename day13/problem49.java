import java.util.*;
public class problem49{
    public static void displayarr(int a[]){
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }

}


public static void main(String[] args){
    int a[]=new int[10];
    System.out.print("enter array element");
    Scanner sc=new Scanner(System.in);
   for(int i=0;i<a.length;i++){
     a[i]=sc.nextInt();
   }
   displayarr(a);
   sc.close();

}
    

}