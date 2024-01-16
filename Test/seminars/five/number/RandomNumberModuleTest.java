package seminars.five.number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RandomNumberModuleTest {

    @Test
    void makeListOfRandomNumbersTest() {
        assertEquals(10, RandomNumberModule.makeListOfRandomNumbers(10).size());
    }
}
