public class problem72 {
    public static void sortindescending(int a[]){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j]<a[j+1]){
                    int temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }


    }
    public static void main(String[] args) {
        int a[]={3,2,7,5,0,4};
        sortindescending(a);
        
    }
    
}
