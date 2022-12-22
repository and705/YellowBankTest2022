package Tasks;

import java.util.*;

public class Task2 {
    public static List results = new ArrayList<array>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        int[] currencyValues = {a, b, c};
        int[] currentAmounts = {x, y, z};

        opNum(currencyValues, currentAmounts);
        System.out.println(results.size());
    }
    public static void opNum(int[] currencyValues, int[] currentAmounts) {
        int[] newAmounts = new int[3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) continue;
                if (currentAmounts[i] < currencyValues[i]) continue;

                for (int k = 0; k < 3; k++) {
                    newAmounts[k] = currentAmounts[k];
                }
                newAmounts[i] -= currencyValues[i];
                newAmounts[j] += currencyValues[j];
                int[] resLine = {newAmounts[0], newAmounts[1], newAmounts[2]};

                    if (!results.contains(new array(resLine))) {
                        results.add(new array(resLine));
                        opNum(currencyValues, newAmounts);
                    }
                }

            }
        }
    }
class array {
        int[] a;

    public array(int[] a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        array array = (array) o;
        return Arrays.equals(a, array.a);
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(a);
    }
}


