// good
public class MutableSort {
    public static void main(String[] args) {
        int[] a = {4, 3, 2};
        int temp = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        //again for numaer of vars -1
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i-1]) {
                temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;
            }
        }
        System.out.println(a[0] + " " + a[1] + " " + a[2]);
    }
}
