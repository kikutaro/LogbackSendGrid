package tech.kikutaro;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Logger logger = LoggerFactory.getLogger(App.class);
        logger.error("hogehogeおおおお");

        assertTrue( true );
    }
}
