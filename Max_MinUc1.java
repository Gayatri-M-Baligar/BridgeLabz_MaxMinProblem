
public class Max_MinUc1<T extends Comparable<T>> {
    // This program finds the maximum among three Integer values
// using Generics and compareTo() method.
    private T firstValue;
    private T secondValue;
    private T thirdValue;

    // Constructor to initialize the three values.
    public Max_MinUc1(T firstValue, T secondValue, T thirdValue) {
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

        // Test Case 1 : Maximum is the first number
        Max_MinUc1<Integer> testCase1 = new Max_MinUc1<>(30, 20, 10);

        System.out.println("Test Case 1");
        System.out.println("Numbers : 30, 20, 10");
        System.out.println("Maximum Number : " + testCase1.findMaximum());

        // Test Case 2 : Maximum is the second number
        Max_MinUc1<Integer> testCase2 = new Max_MinUc1<>(15, 45, 25);

        System.out.println("\nTest Case 2");
        System.out.println("Numbers : 15, 45, 25");
        System.out.println("Maximum Number : " + testCase2.findMaximum());

        // Test Case 3 : Maximum is the third number
        Max_MinUc1<Integer> testCase3 = new Max_MinUc1<>(5, 10, 50);

        System.out.println("\nTest Case 3");
        System.out.println("Numbers : 5, 10, 50");
        System.out.println("Maximum Number : " + testCase3.findMaximum());
    }
}