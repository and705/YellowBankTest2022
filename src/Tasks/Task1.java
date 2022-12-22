package Tasks;

import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            byte n = scanner.nextByte();
            scanner.nextLine();
            String name = scanner.nextLine();
            String idea = scanner.nextLine();
            String[] wordsName = name.split(" ");

            byte result = 0;
            byte prev = 0;

            for (String s : wordsName) {
                String substringOfYB = idea.substring(prev, s.length() + prev);
                for (int j = 1; j < substringOfYB.length(); j++) {
                    if (substringOfYB.charAt(j) == substringOfYB.charAt(j - 1)) {
                        result++;
                        break;
                    }
                }
                prev = (byte) (prev + s.length());
            }

            System.out.println(result);
        }

}
