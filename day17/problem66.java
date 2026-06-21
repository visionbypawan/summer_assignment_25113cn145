public class problem66 {
    public static void union(int a1[], int a2[]) {
        int count = 0;
        int k = 0;
        int n = a1.length + a2.length;
        int unionarr[] = new int[n];
        for (int i = 0; i < a1.length; i++) {
            unionarr[i] = a1[i];
            count++;
        }
        for (int i = 0; i < a2.length; i++) {
            boolean duplicate = false;
            for (int j = 0; j < a1.length; j++) {
                if (a2[i] == a1[j]) {
                    duplicate = true;
                    break;
                }
            }
            if (duplicate == false) {
                unionarr[count + k] = a2[i];
                k++;
            }
        }
        for (int i = 0; i < count + k; i++) {
            System.out.print(unionarr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 6};
        int a2[] = {3, 4, 5, 6};
        union(a1, a2);
    }
}