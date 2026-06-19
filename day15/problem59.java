public class problem59 {
    public static void rotateright(int a[],int by){
        int temp[]= new int[by];
        for(int i=0;i<by;i++){
            temp[i]=a[a.length-by+i];
        }
        for(int i=a.length-by-1;i>=0;i--){
            a[i+by]=a[i];
        }
        for(int i=0;i<by;i++){
            a[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int a[]={4,6,2,8,9,5};
        rotateright(a,2);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
