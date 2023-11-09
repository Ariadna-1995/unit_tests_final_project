package homework6;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.List;

import static homework6.AverageValue.getAverageValue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class AverageValueTest {
    static CompareList ourList;

    @BeforeAll
    static void setUp() {
        ourList = new CompareList();
    }

    @ParameterizedTest
    @MethodSource("provideParameters")
    public void testAverageValue(List<Integer> list1, double result) {
        AverageValue average = new AverageValue();
        double a = getAverageValue(list1);
        assertThat(a).isEqualTo(result);
    }


    static Stream<Arguments> provideParameters() {
        return Stream.of(Arguments.of(Arrays.asList(1, 2, 3), 2), Arguments.of(Arrays.asList(-4, -5, -6), -5), Arguments.of(Arrays.asList(1.5, 2.5, 3.5), 2.5), Arguments.of(Arrays.asList(1), 1), Arguments.of(Arrays.asList(0, 0, 0), 0), Arguments.of(Arrays.asList(), 0));
    }






    @Test
    public void positiveTestList1AverageValueGreaterList2AverageValue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(3, 4, 5);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        AverageValue average1 = new AverageValue();
        double a = getAverageValue(myList1);
        AverageValue average2 = new AverageValue();
        double b = getAverageValue(myList2);
        assertThat(a).isGreaterThan(b);

    }
    @Test
    public void negativeTestList1AverageValueGreaterList2AverageValue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(1, 2, 3);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        AverageValue average1 = new AverageValue();
        double a = getAverageValue(myList1);
        AverageValue average2 = new AverageValue();
        double b = getAverageValue(myList2);
        assertThat(a).isGreaterThan(b);

    }
    @Test
    public void positiveTestList1AverageValueSmallerList2AverageValue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(1, 2, 3);
        List<Integer> myList2 = Arrays.asList(10, 20, 30);
        AverageValue average1 = new AverageValue();
        double a = getAverageValue(myList1);
        AverageValue average2 = new AverageValue();
        double b = getAverageValue(myList2);
        assertThat(b).isGreaterThan(a);

    }
    @Test
    public void negativeTestList1AverageValueSmallerList2AverageValue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(10, 20, 30);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        AverageValue average1 = new AverageValue();
        double a = getAverageValue(myList1);
        AverageValue average2 = new AverageValue();
        double b = getAverageValue(myList2);
        assertThat(b).isGreaterThan(a);

    }


    @Test
    public void positiveTestList1AverageValueEqualList2AverageValue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(1, 2, 3);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        AverageValue average1 = new AverageValue();
        double a = getAverageValue(myList1);
        AverageValue average2 = new AverageValue();
        double b = getAverageValue(myList2);
        assertThat(a).isEqualTo(b);
    }
    @Test
    public void negativeTestList1AverageValueEqualList2AverageValue() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(3, 4, 5);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        AverageValue average1 = new AverageValue();
        double a = getAverageValue(myList1);
        AverageValue average2 = new AverageValue();
        double b = getAverageValue(myList2);
        assertThat(a).isEqualTo(b);
    }



    @Test
    public void positiveTestList1AverageValueGreaterList2AverageValueCompareList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(10, 20, 30);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        ourList.compareOurLists(myList1, myList2);


    }
    @Test
    public void negativeTestList1AverageValueGreaterList2AverageValueCompareList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(1, 2, 3);
        List<Integer> myList2 = Arrays.asList(30, 40, 50);
        ourList.compareOurLists(myList1, myList2);


    }

    @Test
    public void positiveTestList1AverageValueSmallerList2AverageValueCompareList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(1, 2, 3);
        List<Integer> myList2 = Arrays.asList(10, 20, 30);
        ourList.compareOurLists(myList1, myList2);


    }
    @Test
    public void negativeTestList1AverageValueSmallerList2AverageValueCompareList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(30, 40, 50);
        List<Integer> myList2 = Arrays.asList(10, 20, 30);
        ourList.compareOurLists(myList1, myList2);


    }
    @Test
    public void positiveTestList1AverageValueEqualList2AverageValueCompareList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(1, 2, 3);
        List<Integer> myList2 = Arrays.asList(1, 2, 3);
        ourList.compareOurLists(myList1, myList2);


    }
    @Test
    public void negativeTestList1AverageValueEqualList2AverageValueCompareList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        List<Integer> myList1 = Arrays.asList(30, 40, 50);
        List<Integer> myList2 = Arrays.asList(10, 20, 30);
        ourList.compareOurLists(myList1, myList2);


    }


}
