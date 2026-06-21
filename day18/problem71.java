public class problem71{
    public static void binarySearch(int a[],int key){
        int end=a.length-1;
        int start=0;
        while(end>=start){
            int mid=(start+end)/2;
            if(a[mid]==key){
                System.out.print("key is found at index"+mid);
            }
            if(key>a[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

    }
    public static void main(String[] args) {
        int a[]={5,3,7,1,9,7};
        binarySearch(a, 9);
    }
    
}
