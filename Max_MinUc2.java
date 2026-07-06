public class Max_MinUc2<T extends Comparable<T>> {
    // This program finds the maximum among three Float values
    // using Generics and compareTo() method.
    private T firstValue;
    private T secondValue;
    private T thirdValue;

    // Constructor to initialize the three values.
    public Max_MinUc2(T firstValue, T secondValue, T thirdValue) {
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
        Max_MinUc2<Float> testCase1 = new Max_MinUc2<>(30.5f, 20.2f, 10.8f);

        System.out.println("Test Case 1");
        System.out.println("Numbers : 30.5, 20.2, 10.8");
        System.out.println("Maximum Number : " + testCase1.findMaximum());

        // Test Case 2 : Maximum is the second number
        Max_MinUc2<Float> testCase2 = new Max_MinUc2<>(15.4f, 45.9f, 25.6f);

        System.out.println("\nTest Case 2");
        System.out.println("Numbers : 15.4, 45.9, 25.6");
        System.out.println("Maximum Number : " + testCase2.findMaximum());

        // Test Case 3 : Maximum is the third number
        Max_MinUc2<Float> testCase3 = new Max_MinUc2<>(5.1f, 10.3f, 50.7f);

        System.out.println("\nTest Case 3");
        System.out.println("Numbers : 5.1, 10.3, 50.7");
        System.out.println("Maximum Number : " + testCase3.findMaximum());
    }
}