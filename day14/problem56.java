public class problem56 {
    public static int duplicate(int a[]) {
        int duplicatenum=-1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i]==a[j]){
                    duplicatenum=a[i];
                    break;
                }
            }
        }
        return duplicatenum;
        
    }



    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 6, 7, 9, 9};
        int n = duplicate(a);
        if(n==-1){
            System.out.println("not found");
        }else{
            System.out.println("duplicate is  " + n);
        }

    }

}