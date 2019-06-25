package ro.itschool.mvnbase;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.itschool.mvnbase.Tema6.ArrayConcat;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayConcatTest {
    @Test
    @DisplayName("WHEN receive a number THEN return if is palindrome or not")
    void normalUsage(){
        //SETUP
        ArrayConcat array = new ArrayConcat();

        //RUN
        int[] result = array.concatenate(new int[]{1, 2, 3}, new int[]{4, 5});

        //ASSERT
        assertArrayEquals(new int[]{1, 2, 3, 4, 5},result);
    }
}
