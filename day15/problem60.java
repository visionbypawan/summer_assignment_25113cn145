public class problem60 {
    public static void movezerotoend(int a[]){
        for(int i=1;i<a.length;i++){
            if(a[i]==0){
                continue;
            }
            else{
                while(i>0 && a[i-1]==0){
                    int temp=a[i];
                    a[i]=a[i-1];
                    a[i-1]=temp;
                    i--;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={3,2,0,7,0,1,0};
        movezerotoend(a);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}