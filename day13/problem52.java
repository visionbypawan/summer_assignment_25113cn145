public class problem52{
    public static void countevenandodd(int a[]){
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                evencount++;
            }else{
                oddcount++;
            }

        }
        System.out.println("even count is"+evencount);
        System.out.println("odd count is"+oddcount);
    }
    public static void main(String[] args) {
        int a[]={5,4,3,6,7};
        countevenandodd(a);

        
    }
}