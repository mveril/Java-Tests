import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilsTest {
    @Test
    @DisplayName("Should add two numbers")
    void additionner() {
        assertEquals(4,MathUtils.additionner(2,2));
        assertEquals(0,MathUtils.additionner(2,-2));
        assertEquals(-5,MathUtils.additionner(-10,5));
    }

    @Test
    @DisplayName("Should add numbers")
    void additionnerTableau() {
        assertEquals(4,MathUtils.additionner( new int[] {2,2}));
        assertEquals(0,MathUtils.additionner(new int[] {2,-2}));
        assertEquals(-5,MathUtils.additionner(new int[]  {-10,5}));
        assertEquals(0,MathUtils.additionner(new int[]  {-10,5,5}));
    }

    @Test
    @DisplayName("Should multiply numbers")
    void multiplier(){
        assertEquals(16,MathUtils.multiplier(4,4));
        assertEquals(12,MathUtils.multiplier(3,4));
        assertEquals(-6,MathUtils.multiplier(2,-3));
    }

    @Test
    @DisplayName("Should multiply two numbers")
    void multiplierTableau(){
        assertEquals(32,MathUtils.multiplier(new int[] {4,4,2}));
        assertEquals(12,MathUtils.multiplier(new int[] {3,4}));
        assertEquals(-6,MathUtils.multiplier(new int[] {2,-3}));
    }

    @Test
    @DisplayName("Should substract two numbers")
    void soustraire(){
        assertEquals(1,MathUtils.soustraire(4,3));
        assertEquals(-3,MathUtils.soustraire(-6,-3));
        assertEquals(9,MathUtils.soustraire(18,9));
    }
}