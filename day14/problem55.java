public class problem55 {
    public static int secondlargest(int a[]) {
        int largestnum = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] > largestnum) {
                largestnum = a[i];

            }

        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] > seclargest && a[j] != largestnum) {
                seclargest = a[j];
            }
        }
        return seclargest;
    }



    public static void main(String[] args) {
        int a[] = { 5, 4, 3, 6, 7, 9, 8 };
        int n = secondlargest(a);
        System.out.println("2nd largest is " + n);

    }

}