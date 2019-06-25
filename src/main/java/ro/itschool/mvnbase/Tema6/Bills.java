package ro.itschool.mvnbase.Tema6;

import java.util.Arrays;

public class Bills {
    public static int[] calculate(int number) {
        if (number > 0) {
            int[] bills = new int[]{500, 200, 100, 50, 10, 5, 1};
            int i = 0;
            int[] bancnote = new int[100];
            int contor = 0;
            int j = 0;


            while (number != 0) {
                if (number - bills[i] >= 0) {
                    number -= bills[i];
                    bancnote[j] = bills[i];
                    j++;
                } else {
                    i++;
                }
            }
            bancnote = Arrays.copyOf(bancnote, j);
            return bancnote;
        }else{
            System.out.println("The number should be greater than 0");
            return new int[]{0};
        }
    }
}
