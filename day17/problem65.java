public class problem65 {
    public static void mergearr(int a1[],int a2[]){
        int count=0;
        int n=a1.length+a2.length;
        int mergearr[]= new int[n];
        for(int i=0;i<a1.length;i++){
            mergearr[i]=a1[i];
            count++;
        }
        for(int i=0;i<a2.length;i++){
            mergearr[i+count]=a2[i];
        }
        for(int i=0;i<n;i++){

            System.out.print(mergearr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int a1[]={1,2,3};
        int a2[]={4,5,6};
        mergearr(a1,a2);
        
    }
}
