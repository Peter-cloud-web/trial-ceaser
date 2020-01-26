import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptTest {
        @Test
        public void Decrypting_shiftAlphabet_String() {
            Decrypt testDecryption = new Decrypt();
            String expectedOutput = "b";
            assertEquals(expectedOutput, testDecryption.decode("d", 2));
        }
        @Test
        public void Decrypting_shiftWord_String() {
            Decrypt testDecryption = new Decrypt();
            String expectedOutput = "mbqbo";
            assertEquals(expectedOutput, testDecryption.decode("peter", 3));
        }
        @Test
        public void Decrypting_shiftSentence_String() {
            Decrypt testDecryption = new Decrypt();
            String expectedOutput = "qebtloa";
            assertEquals(expectedOutput, testDecryption.decode("Theword", 3));
        }


    }