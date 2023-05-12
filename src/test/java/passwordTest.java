import static org.junit.jupiter.api.Assertions.*;

class passwordTest {

    @org.junit.jupiter.api.Test
    void passwordLengthIsNotLongEnough() {
        assertFalse(password.passwordValidator("pawor"));
    }

    @org.junit.jupiter.api.Test
    void atleastOneLetterCapitalizedTest() {
        assertFalse(password.passwordValidator("nocapital"));
    }

    @org.junit.jupiter.api.Test
    void passwordContainsNoSymbols() {
        assertFalse(password.passwordValidator("ThIshasnosymbol"));
    }

    @org.junit.jupiter.api.Test
    void passwordContainsNoDigits() {
        assertFalse(password.passwordValidator("NoD!gitS"));
    }

    @org.junit.jupiter.api.Test
    void passwordSatisfiesEveryClause() {
        assertTrue(password.passwordValidator("P@ssw0rd"));
    }

   @org.junit.jupiter.api.Test
    void passwordIsLongerThanMaximumCharacters() {
     assertFalse(password.passwordValidator("Th1Sisprobablylongerthan50charactersifimbeinghonestthisisannoying$$$$$$$$$$$$$$$$$$$$$$$"));
   }
}