// good
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
            // NOTE: the 'else' on the following line makes me really uncomfortable, although I think it's logically equivalent to two simple if statements (which I prefer)
            else if (a[i] > max) {
                    max = a[i];
                    System.out.println("max: " + max);
            }
        }
        System.out.println(max - min);
    }
}
