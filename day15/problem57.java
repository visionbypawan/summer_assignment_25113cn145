public class problem57{
    public static void revarr(int a[]){
        for(int i=0;i<a.length/2;i++){
            int temp=a[(a.length-1)-i];
            a[(a.length-1)-i]=a[i];
            a[i]=temp;
        }

    }
    public static void main(String[] args) {
        int a[]={2,5,8,1,6,0};
        revarr(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    
    }
}