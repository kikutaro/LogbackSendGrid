package tech.kikutaro;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );

        Logger logger = LoggerFactory.getLogger(App.class);
        logger.error("hogehoge");

        Thread.sleep(30000);
    }
}
