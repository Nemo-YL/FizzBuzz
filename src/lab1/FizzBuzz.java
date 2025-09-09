package lab1;

/**
 * Solve the lab1.FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        int i = 1;
        while (i < 100) {
            dofizzbuzz(i % 3 == 0, i % 5 == 0, "FizzBuzz", i);
            i++;
        }
        for (int i = 1; i < 100; i++) {

            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            dofizzbuzz(divisibleBy3, divisibleBy5, "Fizz Buzz", i);
        }
    }

    private static void dofizzbuzz(boolean i, boolean i1, String FizzBuzz, int i2) {
        if (i && i1) {
            System.out.println(FizzBuzz);
        } else if (i) {
            System.out.println("Fizz");
        } else if (i1) {
            System.out.println("Buzz");
        } else {
            System.out.println(i2);
        }
    }
}
