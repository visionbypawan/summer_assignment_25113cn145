public class problem53{
    public static int linearsearch(int a[],int key){
        int loc=-1;

        for(int i=0;i<a.length;i++){
            if(a[i]==key){
                loc=i;
            }
        }
        return loc;

    }
        
    public static void main(String[] args) {
        int a[]={5,4,3,6,7,9,8};
        int key=9;
        int n=linearsearch(a,key);
        if(n==-1){
            System.out.println("key not found");
        }else{
            System.out.print("key found at index"+n);
        }
        

        
    }

    
}