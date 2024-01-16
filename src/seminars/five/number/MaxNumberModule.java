package seminars.five.number;

import java.util.List;

public class MaxNumberModule {

    public static int getMaxFromList(List<Integer> listOfNumbs){
        return listOfNumbs.stream().max(Integer::compare).get();
    }

}
