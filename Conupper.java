import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Conupper {
    public static void main(String[] args) {  

        List<String> names = Arrays.asList("bbb", "abc", "art", "ggg");
        String s = names.stream().map(name -> name.toUpperCase()).collect(Collectors.joining(","));
        System.out.println(s);
}
}
