package Tasks;

import java.util.Scanner;

public class Task3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int nokMin = Integer.MAX_VALUE;
        int resultA = 0;
        int resultB = 0;

        for (int i = 1; i < input; i++) {
            int a = i;
            int b = input - i;
            int nok = nok(a, b);
            if (nok < nokMin) {
                nokMin = nok;
                resultA = a;
                resultB = b;
            }
        }

        System.out.println(resultA + " " + resultB);

    }

    public static int nok(int a, int b) {
        int a1 = a;
        int b1 = b;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return (a1 * b1) / a;
    }
}
