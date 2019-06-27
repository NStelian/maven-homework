package ro.itschool.mvnbase.tema6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.itschool.mvnbase.Tema6.Bills;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BillsTest {
    @Test
    @DisplayName("WHEN receive a positive number THEN return the bills")
    void normalUsage(){
        //SETUP
        Bills bil = new Bills();

        //RUN
        int[] result = bil.calculate(732);

        //ASSERT
        assertArrayEquals(new int[]{500, 200, 10, 10, 10, 1, 1},result);
    }
    @Test
    @DisplayName("WHEN receive a negative number THEN return a message and an array = {0}")
    void negativeNumber(){
        //SETUP
        Bills bil = new Bills();

        //RUN
        int[] result = bil.calculate(-732);

        //ASSERT
        assertArrayEquals(new int[]{0},result);
    }
}
