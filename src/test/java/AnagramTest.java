import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnagramTest {
    private static final ByteArrayOutputStream out = new ByteArrayOutputStream();
    private static final PrintStream origOut = System.out;
    private static final InputStream origIn = System.in;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(out));
    }

    @AfterEach
    public void restoreStreams() {
        out.reset();
        System.setIn(origIn);
        System.setOut(origOut);
    }

    @Test
    public void testCheckAnagram() {
        String inputWords = "anagram\n" +
                "margana";
        ByteArrayInputStream in = new ByteArrayInputStream(inputWords.getBytes());
        System.setIn(in);
        Anagram.main(new String[0]);
        assertEquals("Anagrams\n", out.toString());
    }
}
