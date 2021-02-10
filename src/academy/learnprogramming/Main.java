package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int count = 0;
        int sum = 0;

        for (int i = 1; i <= 1000; i++) { // for range of numbers to 1000
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count++;
                sum += i; // add to running sum
                System.out.println("Found number = " + i); // show matching number

                if (count == 5) { // limit count of matches to 5
                    break;  // done
                }
            }
        }
        System.out.println("Sum = " + sum); // display sum of 5 matched numbers
    }
}
