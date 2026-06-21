public class problem61 {
    public static void maxfreq(int a[]) {
        int maxfreq = 0;
        int element = 0;
        for(int i=0; i<a.length; i++) {
            int count = 0;
            for (int j=0; j<a.length; j++) {
                if (a[i]==a[j]) {
                    count++;
                }
            }
            if (count>maxfreq) {
                maxfreq=count;
                element=a[i];
            }
        }
        System.out.println("Maximum frequency element = " + element);
    }
    public static void main(String[] args) {
        int a[] = {2, 3, 2, 5, 2, 4, 3, 3};

        maxfreq(a);
    }
}