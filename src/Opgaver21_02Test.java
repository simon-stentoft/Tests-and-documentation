import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Opgaver21_02Test {

    //Opgave 1
    @Test
    void f() {
        Opgaver21_02 opg1 = new Opgaver21_02();
        int tal = opg1.f(4);
        assertEquals(1, tal); //Test passes
    }

    @Test
    void udskriv() {
        Opgaver21_02 opg1 = new Opgaver21_02();
        boolean ye = opg1.udskriv(40, "ja");
        assertTrue(ye); //Test passes
    }

    //Opgave 2
    @Test
    void returnLargest() {
        Opgave2 opg2 = new Opgave2();
        int tal = opg2.returnLargest(2, 5);
        assertEquals(4, tal); //Expect 4, but get 5, so test fails.
    }

    @Test
    void returnSmallest() {
        Opgave2 opg2 = new Opgave2();
        int tal = opg2.returnSmallest(2, 5);
        assertEquals(2, tal); //Test passes.
    }

    @Test
    void returnSmallestOf3() {
        Opgave2 opg2 = new Opgave2();
        int tal = opg2.returnSmallestOf3(3, 5,10);
        assertEquals(3, tal); //Test passes.
    }

    @Test
    void returnLargestOf3() {
        Opgave2 opg2 = new Opgave2();
        int tal = opg2.returnLargestOf3(3, 5,10);
        assertEquals(10, tal); //Test passes.
    }

    @Test
    void returnSmallestInArray() {
        Opgave2 opg2 = new Opgave2();
        int[] hejArray = {7,4,5,6,6,2,4,3,3,4,444};
        int tal = opg2.returnSmallestInArray(hejArray,11);
        assertEquals(2, tal); //Test passes.
    }

    @Test
    void returnLargestInArray() {
        Opgave2 opg2 = new Opgave2();
        int[] hejArray = {2,4,5,6,6,7,4,3,3,4,444};
        int tal = opg2.returnLargestInArray(hejArray);
        assertEquals(333, tal); //Test fails, because expected is 333, when tal is 444.
    }

    @Test
    void returnSumOfArray() {
        Opgave2 opg2 = new Opgave2();
        int[] hejArray = {2,4,5,6,6,7,4,3,3,4,444};
        int tal = opg2.returnSumOfArray(hejArray);
        assertEquals(488, tal); //Test passes.
    }

    @Test
    void returnAverageOfArray() {
        Opgave2 opg2 = new Opgave2();
        int[] hejArray = {2,4,5,6,6,7,4,3,3,4,444};
        int tal = opg2.returnAverageOfArray(hejArray);
        assertEquals(44, tal); //Test passes.
    }
}