package lambda;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jan", "Tirion", "Marry", "Nikolas");

        long count = names.stream()
                .count();
        System.out.println(count); //output  3
    }
}
