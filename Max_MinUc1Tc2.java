// This program finds the maximum among three Integer values
// using Generics and compareTo() method.

public class Max_MinUc1Tc2<T extends Comparable<T>> {

    private T firstValue;
    private T secondValue;
    private T thirdValue;

    // Constructor to initialize the values.
    public Max_MinUc1Tc2(T firstValue, T secondValue, T thirdValue) {
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

        // Test Case : Maximum number is in the second position.
        Max_MinUc1Tc2<Integer> maximumNumber =
                new Max_MinUc1Tc2<>(20, 50, 10);

        System.out.println("Numbers : 20, 50, 10");
        System.out.println("Maximum Number : " + maximumNumber.findMaximum());
    }
}