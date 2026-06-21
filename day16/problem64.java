public class problem64{
    public static void removeduplicate(int a[]){
        int temp[]=new int [a.length];
        int k=0;
        for(int i=0;i<a.length;i++){
            boolean duplicate=false;
            for(int j=0;j<k;j++){
                if(a[i]==temp[j]){
                    duplicate=true;
                    break;
                }

            }
            if(!duplicate){
                temp[k]=a[i];
                k++;

            }
        }
        for(int i=0;i<k;i++){
            System.out.print(temp[i]+" ");

        }

    }
    public static void main(String args[]){
        int a[]={2,3,4,2,5,3,6,5};
        removeduplicate(a);
    }
}