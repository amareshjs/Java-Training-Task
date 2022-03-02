import java.util.*;   
public class Count {  
    public static void main(String[] args) {  

            List<String> names = Arrays.asList("bbb", "abc", "art", "ggg");
            long s = names.stream().filter(name -> name.startsWith("a")).count();
            System.out.println(s);
    }}
