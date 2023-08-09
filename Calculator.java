package EX_OOP.ex_2_calculator;
public class Calculator {
    int fact = 1;
    public static int sumNo(int no1, int no2) {
        return (no1 + no2);
    }
    public static int diffNo(int no1, int no2) {
        return Math.abs(no1 - no2);
    }
    public static int factorialNo(int no1) {
        int fact = 1;
        for (int i = 1; i < no1; ++i) {
            fact = fact *  i;
        }
        return fact;
    }
}
