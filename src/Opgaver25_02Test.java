import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class Opgaver25_02Test {

    @Test
    void tax() {
        Opgaver25_02 opg1 = new Opgaver25_02();
        double number = opg1.tax(50);
        assertEquals(52.5, number); //Test passes.
    }

    @Test
    void polynomial() {
        Opgaver25_02 opg1 = new Opgaver25_02();
        double number = opg1.polynomial(2);
        assertEquals(92, number); //Test passes.
    }
}