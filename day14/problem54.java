public class problem54{
    public static int frequency(int a[],int key){
        int count=0;
       for(int i=0;i<a.length;i++){
        if(a[i]==key){
            count++;
        }
       }
       return count;
    }
        
    public static void main(String[] args) {
        int a[]={5,4,3,3,3,9,9};
        int n=frequency(a,3);
        System.out.println("frequency is "+n);
        

        
    }

    
}