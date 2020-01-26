import org.junit.Test;

import static org.junit.Assert.*;

public class EncryptTest {
    @Test
    public void Encrypting_shiftAlphabet_String() {
        Encrypt testEncryption = new Encrypt();
        String expectedOutput = "G";
        assertEquals(expectedOutput, testEncryption.encode("e", 2));
    }
    @Test
    public void Encrypting_shiftWord_String() {
        Encrypt testEncryption = new Encrypt();
        String expectedOutput = "UJYJW";
        assertEquals(expectedOutput, testEncryption.encode("peter", 5));
    }
    @Test
    public void Encrypting_shiftSentence_String() {
        Encrypt testEncryption = new Encrypt();
        String expectedOutput = "WKHZRUG";
        assertEquals(expectedOutput, testEncryption.encode("The word", 3));
    }


}