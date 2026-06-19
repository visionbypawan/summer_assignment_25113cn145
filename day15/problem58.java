public class problem58 {
    public static void rotateleft(int a[],int by){
        int temp[]= new int[by];
        for(int i=0;i<by;i++){
            temp[i]=a[i];
        }
        for(int i=by;i<a.length;i++){
            a[i-by]=a[i];
        }
        for (int i = 0; i < by; i++) {
            a[a.length - by + i] = temp[i];
        }

    }
    public static void main(String[] args) {
        int a[]={4,6,2,8,9,5};  //289546
        rotateleft(a,4);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
