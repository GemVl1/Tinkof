
package integrationTest;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataBaseTest extends integrationEnvironment {


    @Test
    public void testIfContainerIsRunning() {
        Assertions.assertTrue(CONTAINER.isRunning());
    }

}

