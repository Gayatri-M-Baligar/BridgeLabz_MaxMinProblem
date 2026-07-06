public class Max_MinRefactor1 {
// This program uses one generic method to find the maximum
// among three values of different data types.

    // Generic method to find the maximum value.
    public static <T extends Comparable<T>> T findMaximum(T firstValue, T secondValue, T thirdValue) {

        T maximum = firstValue;

        if (secondValue.compareTo(maximum) > 0) {
            maximum = secondValue;
        }

        if (thirdValue.compareTo(maximum) > 0) {
            maximum = thirdValue;
        }

        return maximum;
    }

    public static void main(String[] args) {

        // Integer Test Case
        System.out.println("Maximum Integer : "
                + findMaximum(30, 20, 10));

        // Float Test Case
        System.out.println("Maximum Float : "
                + findMaximum(30.5f, 20.2f, 10.8f));

        // String Test Case
        System.out.println("Maximum String : "
                + findMaximum("Apple", "Peach", "Banana"));
    }
}