import java.util.*;
import java.util.stream.Collectors;

public class Counter {

    public void counter(String something){
        String[] array = something.toLowerCase().split("");
        Map<String, Long> collect = Arrays.stream(array).collect(Collectors.groupingBy(entry -> entry, Collectors.counting()));

        List<Map.Entry<String,Long>> result =
                collect.entrySet()
                        .stream()
                        .sorted(Map.Entry.comparingByKey())
                        .collect(Collectors.toList());

        System.out.println(result);
    }
}
