import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Largestnumber {
    public static void main(String[] args) {
        System.out.println(buildMaxNumber(101)); // 975
        System.out.println(buildMaxNumber(998)); // 100
        System.out.println(buildMaxNumber(576)); // 321
        System.out.println(buildMaxNumber(999)); // 999
    }

    private static int buildMaxNumber(int number) {
        List<Integer> digits = new ArrayList<>();

        while (number > 0) {
            digits.add(number % 10);
            number /= 10;
        }
        Collections.sort(digits);

        int multiplier = 1;
        int result = 0;
        for (int digit : digits) {
            result += digit * multiplier;
            multiplier *= 10;
        }

        return result;
    }
}
        // разбить на отдельные числа
        //определить какое число наибольшее
        // разместить цифры от наибольшнго к наименьшему
//










