// This program uses a Generic Class to find the maximum
// among three values using Generics.

public class Max_MinRefactor2<T extends Comparable<T>> {

    private T firstValue;
    private T secondValue;
    private T thirdValue;

    // Constructor to initialize the three values.
    public Max_MinRefactor2(T firstValue, T secondValue, T thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    // Generic static method to find the maximum value.
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

    // Calls the static method using the instance variables.
    public T testMaximum() {
        return findMaximum(firstValue, secondValue, thirdValue);
    }

    public static void main(String[] args) {

        // Integer Test Case
        Max_MinRefactor2<Integer> integerObject =
                new Max_MinRefactor2<>(30, 20, 10);

        System.out.println("Maximum Integer : "
                + integerObject.testMaximum());

        // Float Test Case
        Max_MinRefactor2<Float> floatObject =
                new Max_MinRefactor2<>(30.5f, 20.2f, 10.8f);

        System.out.println("Maximum Float : "
                + floatObject.testMaximum());

        // String Test Case
        Max_MinRefactor2<String> stringObject =
                new Max_MinRefactor2<>("Apple", "Peach", "Banana");

        System.out.println("Maximum String : "
                + stringObject.testMaximum());
    }
}