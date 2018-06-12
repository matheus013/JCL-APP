package laccan.persistence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumericValidationTest {

    @Test
    void testWithSize() {
        NumericValidation validation = new NumericValidation();
        assertTrue(validation.testWithSize(new String[]{"12","120"},2));
        assertTrue(validation.testWithSize(new String[]{"12.23","120.1231"},2));
        assertTrue(validation.testWithSize(new String[]{"-12","-120.123"},2));
    }
}