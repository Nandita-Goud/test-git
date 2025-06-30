import java.util.Scanner;

public class CustomOddSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        // If a is even, reduce it by 1 to get the number of odd terms
        int count = (a % 2 == 0) ? a - 1 : a;

        System.out.print("Output: ");
        for (int i = 0; i < count; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < count - 1) {
                System.out.print(", ");
            }
        }
    }
}
