import java.util.Arrays;
import java.util.List;

public class Sort {
    public static void main(String[] args) {  

        List<String> names = Arrays.asList("bbb", "abc", "art", "ggg");
        names.stream().sorted().forEach(System.out::println);;
}
}
