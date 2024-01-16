package seminars.five.number;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationMaxNumbAndRandomNumbTest {
    @Test
    public void integrationRandomListAndMaxNumb(){
        List<Integer> list = RandomNumberModule.makeListOfRandomNumbers(10);

        int maxNumb = MaxNumberModule.getMaxFromList(list);

        assertEquals(Collections.max(list), maxNumb);
    }
}
