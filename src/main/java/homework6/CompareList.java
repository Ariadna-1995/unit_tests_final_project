package homework6;

import java.util.List;

public class CompareList {
    AverageValue average = new AverageValue();

    public void compareOurLists(List<Integer> list1, List<Integer> list2) {
        double a1 = average.getAverageValue(list1);
        double a2 = average.getAverageValue(list2);
        if (a1 > a2) System.out.print("Первый список имеет большее среднее значение");
        else if (a1 < a2) System.out.print("Второй список имеет большее среднее значение");
        else System.out.print("Средние значения равны");
    }
}
