package seminars.five.number;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxNumberModuleTest {

    @Test
    void getMaxFromListTest() {
        List<Integer> list = List.of(2_100_193_392, 929, 9492, 0, -1393913, -2_012_492_949);
        assertEquals(2_100_193_392, MaxNumberModule.getMaxFromList(list));
    }
}