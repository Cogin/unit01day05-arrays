public class ThreeArrayRange {
    public static void main(String[] args) {
        int[] a = {5, 1, 3};
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                    min = a[i];
                    System.out.println("min: " + min);
            }
            else if (a[i] > max) {
                    max = a[i];
                    System.out.println("max: " + max);
            }
        }
        System.out.println(max - min);
    }
}
