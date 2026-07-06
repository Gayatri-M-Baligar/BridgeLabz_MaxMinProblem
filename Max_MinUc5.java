// This program finds the maximum value using a Generic Class.
// The maximum value is printed using the printMax() method.

public class Max_MinUc5<T extends Comparable<T>> {

    private T firstValue;
    private T secondValue;
    private T thirdValue;

    // Constructor to initialize the values.
    public Max_MinUc5(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

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

    // Generic method to print the maximum value.
    public static <T> void printMax(T maximum) {
        System.out.println("Maximum Value : " + maximum);
    }

    // Calls findMaximum() and then printMax().
    public void testMaximum() {

        T maximum = findMaximum(firstValue, secondValue, thirdValue);

        printMax(maximum);
    }

    public static void main(String[] args) {

        // Integer Test Case
        System.out.println("Integer Test");
        Max_MinUc5<Integer> integerObject =
                new Max_MinUc5<>(30, 20, 10);
        integerObject.testMaximum();

        // Float Test Case
        System.out.println("\nFloat Test");
        Max_MinUc5<Float> floatObject =
                new Max_MinUc5<>(30.5f, 20.2f, 10.8f);
        floatObject.testMaximum();

        // String Test Case
        System.out.println("\nString Test");
        Max_MinUc5<String> stringObject =
                new Max_MinUc5<>("Apple", "Peach", "Banana");
        stringObject.testMaximum();
    }
}