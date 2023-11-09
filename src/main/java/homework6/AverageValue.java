package homework6;

import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class AverageValue {
    public static double getAverageValue(List<Integer> list) {

        double result = 0;
        for (int i : list) {
            result += i;
        }
        return result / list.size();


    }


}


