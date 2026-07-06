import java.util.Arrays;

// This program finds the maximum value among multiple elements
// using Generics, varargs and sorting.

public class Max_MinUc4 {

    // Generic method to find the maximum value.
    public static <T extends Comparable<T>> T findMaximum(T... values) {

        // Sort the values in ascending order.
        Arrays.sort(values);

        // Return the last element since it will be the maximum.
        return values[values.length - 1];
    }

    public static void main(String[] args) {

        // Integer Test Case
        System.out.println("Maximum Integer : "
                + findMaximum(10, 30, 50, 20, 40));

        // Float Test Case
        System.out.println("Maximum Float : "
                + findMaximum(12.5f, 45.8f, 25.6f, 30.2f, 18.4f));

        // String Test Case
        System.out.println("Maximum String : "
                + findMaximum("Apple", "Peach", "Banana", "Orange", "Mango"));
    }
}