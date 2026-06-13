public class problem51{
    public static void largestandsmallest(int a[]){
        int largest=a[0];
        int smallest=a[0];
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                largest=a[i];
                

            }
            if(smallest>a[i]){
                smallest=a[i];
            }
        }
        System.out.println("largets is "+largest);
        System.out.println("smallest is "+smallest);
        
    }
    public static void main(String[] args) {
        int a[]={5,4,3,6,7};
        largestandsmallest(a);

        
    }
}