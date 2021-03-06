package pkg;

import org.junit.Test;

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static pkg.ATest.DELAY_MULTIPLIER;

public class DTest
{
    @Test
    public void test()
        throws InterruptedException
    {
        // checking processros # due to very slow Windows Jenkins machines
        MILLISECONDS.sleep( DELAY_MULTIPLIER * ( Runtime.getRuntime().availableProcessors() == 1 ? 9000L : 3750L ) );
    }

}
