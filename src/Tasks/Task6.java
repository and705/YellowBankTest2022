package Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iter = scanner.nextInt();
        int num;
        ArrayList<Integer> array = new ArrayList<>();
        int maxXor = 0;

        for (int k=0;k<iter;k++){
            num = scanner.nextInt();
            if (!array.contains(num)){
                array.add(num);
            }
            for (int i=0; i<array.size()-1;i++){
                for(int j = i+1;j<array.size();j++){
                    int xor = array.get(i)^array.get(j);
                    if (xor > maxXor){
                        maxXor = xor;
                    }
                }
            }
            System.out.println(maxXor);
        }
    }
}
