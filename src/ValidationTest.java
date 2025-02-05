import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ValidationTest {

    private Validation v;

    @BeforeEach
    public void setUp() {
        this.v = new Validation();
    }

    @org.junit.jupiter.api.Test
    void validateName() {
        //should be true
        assertTrue(v.validateName("Bryan"));
        assertTrue(v.validateName("D'Angelo"));
        assertTrue(v.validateName("Anna-Marie"));
        assertTrue(v.validateName("Garcia Martinez"));
        assertTrue(v.validateName("F. Scott"));

        //should be false
        assertFalse(v.validateName("!iam"));
        assertFalse(v.validateName("???"));
        assertFalse(v.validateName(" "));
        assertFalse(v.validateName(" Bryan"));
        assertFalse(v.validateName("Bryan "));
    }

    @org.junit.jupiter.api.Test
    void validateEmail() {

    }

    @org.junit.jupiter.api.Test
    void validatePassword() {
    }
}