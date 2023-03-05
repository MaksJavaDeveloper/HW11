package Task1;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Task1 {

    public String listMethod(List list) {
        StringBuilder sb = new StringBuilder();

        for (Object o : list) {
            if (list.indexOf(o) % 2 != 0) {
                sb.append(list.indexOf(o));
                sb.append(". ");
                sb.append(o);
                if (list.size() - 1 > list.indexOf(o) && list.size() - 2 > list.indexOf(o)) {
                    sb.append(", ");
                }
            }
        }

        return sb.toString().trim();
    }

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Kate", "Bill", "Shon", "Alex", "Stefan", "Steven", "Maks", "Vlad");


        //Task 1
        System.out.println(new Task1().listMethod(names));

    }
}