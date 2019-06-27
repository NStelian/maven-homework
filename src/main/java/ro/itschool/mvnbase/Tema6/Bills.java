package ro.itschool.mvnbase.Tema6;

import java.util.Arrays;

public class Bills {
    public static int[] calculate(int sumOfMoney) {
        if (sumOfMoney > 0) {
            int[] bills = new int[]{500, 200, 100, 50, 10, 5, 1};
            int i = 0;
            int[] result = new int[100];
            int j = 0;

            while (sumOfMoney != 0) {
                if (sumOfMoney - bills[i] >= 0) {
                    sumOfMoney -= bills[i];
                    result[j] = bills[i];
                    j++;
                } else {
                    i++;
                }
            }
            result = Arrays.copyOf(result, j);
            return result;
        }else{
            System.out.println("The number should be greater than 0");
            return new int[]{0};
        }
    }
}
