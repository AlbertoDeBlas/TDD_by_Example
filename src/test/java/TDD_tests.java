import org.junit.jupiter.api.Test;

public class TDD_tests {

    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}

