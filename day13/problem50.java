public class problem50{
    public static void sumandav(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];


        }
        float average=sum/a.length;
        System.out.println("sum is "+sum);
        System.out.println("average is "+average );

    }
    public static void main(String[] args) {
        int a[]={5,4,3,6,7};
        sumandav(a);

        
    }
}
