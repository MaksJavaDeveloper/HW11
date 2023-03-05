package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2<T> {


    public List<String> reverseMethod(List<String> list) {

        return list.stream()
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kate", "Bill", "Shon", "Alex", "Stefan", "Steven", "Maks", "Vlad");

        System.out.println(Arrays.toString(new List[]{new Task2().reverseMethod(names)}));
    }
}
