public class problem63{
    public static void pairsum(int a[],int sum){
        for(int i=0;i<a.length-1;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]+a[j]==sum){
                    System.out.println(a[i]+" "+a[j]);
                }
            }
        }
    }
    public static void main(String[] args){
        int a[]={2,7,4,5,3,1};
        pairsum(a,9);
    }
}