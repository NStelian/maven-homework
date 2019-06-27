package ro.itschool.mvnbase.tema6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ro.itschool.mvnbase.Tema6.LeapYear;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {
    @Test
    @DisplayName("WHEN receive a year THEN return if is a leap year or not")
    void normalUsage(){
        //SETUP
        LeapYear leap = new LeapYear();

        //RUN
        boolean result = leap.leapCheck(1600);

        //ASSERT
        assertEquals(true,result);
    }
    @Test
    @DisplayName("WHEN receive a negative year THEN return false")
    void negativeYear(){
        //SETUP
        LeapYear leap = new LeapYear();

        //RUN
        boolean result = leap.leapCheck(-1600);

        //ASSERT
        assertEquals(false,result);
    }
}
