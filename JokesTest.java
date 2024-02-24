import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JokesTest {
    @Test
    public void testgetJoke() {
        String str = Jokes.getJoke("");
        assertEquals("", str);
    }
}
