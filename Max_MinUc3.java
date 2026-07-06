public class Max_MinUc3<T extends Comparable<T>> {
// This program finds the maximum among three String values
// using Generics and compareTo() method.

    private T firstValue;
    private T secondValue;
    private T thirdValue;

    // Constructor to initialize the three values.
    public Max_MinUc3(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    // Returns the maximum value among the three.
    public T findMaximum() {

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

        // Test Case 1 : Maximum is the first string
        Max_MinUc3<String> testCase1 =
                new Max_MinUc3<>("Peach", "Banana", "Apple");

        System.out.println("Test Case 1");
        System.out.println("Strings : Peach, Banana, Apple");
        System.out.println("Maximum String : " + testCase1.findMaximum());

        // Test Case 2 : Maximum is the second string
        Max_MinUc3<String> testCase2 =
                new Max_MinUc3<>("Apple", "Peach", "Banana");

        System.out.println("\nTest Case 2");
        System.out.println("Strings : Apple, Peach, Banana");
        System.out.println("Maximum String : " + testCase2.findMaximum());

        // Test Case 3 : Maximum is the third string
        Max_MinUc3<String> testCase3 =
                new Max_MinUc3<>("Apple", "Banana", "Peach");

        System.out.println("\nTest Case 3");
        System.out.println("Strings : Apple, Banana, Peach");
        System.out.println("Maximum String : " + testCase3.findMaximum());
    }
}