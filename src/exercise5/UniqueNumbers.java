package exercise5;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number count: ");
        int numberCount = input.nextInt();

        int[] numbers = new int[numberCount];

        System.out.println("Enter numbers: ");
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = input.nextInt();
        }

        int[] uniqueNumbers = new int[numbers.length];

        int nextUniqueIndex = 0;
        for (int index = 0; index < numbers.length; index++) {
           boolean found = false;

          for (int i = 0; i < uniqueNumbers.length; i++) {
            if (numbers[index] == uniqueNumbers[i]) {
              found = true;
              break;
            }
          }

          if (!found) {
            uniqueNumbers[nextUniqueIndex]= numbers[index];
            nextUniqueIndex++;
          }
        }
        // Find unique numbers in numbers

        String uniqueNumbersAsString = Arrays.toString(uniqueNumbers);
        System.out.println("Unique numbers: " + uniqueNumbersAsString);
    }
}
