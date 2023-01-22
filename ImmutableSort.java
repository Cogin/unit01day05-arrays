public class ImmutableSort {
    public static void main(String[] args) {
        int[] a = {4, 3, 2};
        int[] b = a; // b is a reference to a
        // Sort the array without modifying a
        // FIXME: you're totally right... b is a reference to a. Which means you are inadvertently modifying a. You should be creating a new array, with the 'new' keyword

        // NOTE: I agree this is bubble sort
        //bubble sort i think
        int temp = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (b[i] < b[i-1]) {
                temp = b[i];
                b[i] = b[i-1];
                b[i-1] = temp;
            }
        }
        //again for number of vars -1
        for (int i = 1; i < a.length; i++) {
            if (b[i] < b[i-1]) {
                temp = b[i];
                b[i] = b[i-1];
                b[i-1] = temp;
            }
        }
        System.out.println(b[0] + " " + b[1] + " " + b[2]);
    }
}
