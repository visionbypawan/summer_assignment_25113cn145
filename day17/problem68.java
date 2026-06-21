public class problem68 {
    public static void intersection(int a1[],int a2[]){
        int k=0;
        int intersection[]= new int [a1.length];
        for(int i=0;i<a1.length;i++){
            boolean duplicate=false;
            for(int j=0;j<a2.length;j++){
                if(a1[i]==a2[j]){
                    duplicate=true;
                    break;

                }
            }
            if(duplicate){
                intersection[k]=a1[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            System.out.print(intersection[i]);
        }

    }
    public static void main(String[] args) {
        int a1[]={1,2,3,4};
        int a2[]={3,4,5,6};
        intersection(a1, a2);
        
    }
    
}
