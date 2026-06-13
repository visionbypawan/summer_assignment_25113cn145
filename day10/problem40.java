public class problem40{
    public static void main(String[] args) {
        
        for(int i=1;i<=5;i++){
            char ch='A';
            
            for(int j=1;j<5-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
                
            
            }
            ch--;
            for(int j=i-1;j>0;j--){
                ch--;
                System.out.print(ch);
                
            }
            System.out.println();
            
    
        }
    }
}