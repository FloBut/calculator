package EX_OOP.ex_2_calculator;
public class Calculate {
static int no1 = 10, no2 = 5, sum = 0, dif = 0, fact = 1;
    public static int sumNo() {
        sum = no1 + no2;
        return sum;
    }
    public static int diffNo() {
        dif = Math.abs(no1 - no2);
        return dif;
    }
    public static int factorialNo(){
        for (int i = 1; i < no1; ++i) {
            fact = fact *  i;
        }
        return fact;
    }
}
