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
        //should be true
        assertTrue(v.validateEmail("BryanCrombach@gmail.com"));
        assertTrue(v.validateEmail("Bryanipod@hotmail.co.nz"));
        assertTrue(v.validateEmail("Bryan_crombach@xtra.co.nz"));
        assertTrue(v.validateEmail("Bryan-crombach@xtra.com"));
        assertTrue(v.validateEmail("Bryan.crombach@gmail.com"));

        //should be false
        assertFalse(v.validateEmail(".Bryan@gmail.com"));
        assertFalse(v.validateEmail("Bryan@gmail..com"));
        assertFalse(v.validateEmail("Bryan.gmail.com"));
        assertFalse(v.validateEmail("Bryan@gmail"));
        assertFalse(v.validateEmail("01234567890123456789012345678901234567890123456789012345678901234@gmail.com"));
        assertFalse(v.validateEmail("Bryan@01234567890123456789012345678901234567890123456789012345678901234567890123.com"));
        assertFalse(v.validateEmail("Bryan@ gmail.com"));
    }

    @org.junit.jupiter.api.Test
    void validatePassword() {
        //should be true
        assertTrue(v.validatePassword("Bryan-2222"));
        assertTrue(v.validatePassword("L!@#$%^&*(4)_+q"));
        assertTrue(v.validatePassword("daniE!2002"));
        assertTrue(v.validatePassword("A!z[#08rgV@Tz12vv(v,"));
        assertTrue(v.validatePassword("#T<=dLJW+^swg68EU}xZ"));

        //should be false
        assertFalse(v.validatePassword("Bryan2222"));
        assertFalse(v.validatePassword("Bryan!jwidjh"));
        assertFalse(v.validatePassword("bryan!200002"));
        assertFalse(v.validatePassword("Br!2"));
        assertFalse(v.validatePassword(""));
        assertFalse(v.validatePassword("BRYAN!22"));
    }
}