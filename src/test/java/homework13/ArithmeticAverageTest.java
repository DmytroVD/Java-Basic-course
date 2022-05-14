package homework13;

import com.hillel.dmytrevskyi.lessons.homework13.ArithmeticAverage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArithmeticAverageTest {

    ArithmeticAverage arithmeticAverage = new ArithmeticAverage();
    int[][] array = new int[][] {{4, 3, 6}, {2, 4, 8}, {6, 5, 1} };





    @Test
    public void average() {
        Assertions.assertEquals(4.333333333333333, arithmeticAverage.getAverage(array));
    }

    @Test
    public void isSquare() {
        Assertions.assertTrue( arithmeticAverage.isSquare(array));
    }




}
