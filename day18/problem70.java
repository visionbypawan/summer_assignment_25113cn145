public class problem70 {
    public static void selectionsort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int minpose=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minpose]>a[j]){
                    minpose=j;
                }

            }
            int temp=a[minpose];
            a[minpose]=a[i];
            a[i]=temp;

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }
    public static void main(String[] args) {
        int a[]={7,9,5,6,2,4,1,3};
        selectionsort(a);
        
    }
}
