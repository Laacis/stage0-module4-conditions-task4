package school.mjc.stage0.conditions.task4;

public class MaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int greatestNumber;

        if (first >= second && first >= third) {
            greatestNumber = first;
        } else if (second >= first && second >= third) {
            greatestNumber = second;
        } else{
            greatestNumber =third;
        }

        System.out.println(greatestNumber);
    }
}
