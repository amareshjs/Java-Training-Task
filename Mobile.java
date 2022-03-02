import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mobile {
    public static void main(String[] args) {  
        List<Student> sl=new ArrayList<Student>();
       
       sl.add(new Student(1,"ABC","3333"));
       sl.add(new Student(2,"BAA","3333"));
       sl.add(new Student(3,"ert","4565"));
       sl.add(new Student(4,"edc","1234"));
       sl.add(new Student(5,"iop","4567"));

        List l3=sl.stream().filter(x->x.num.contains("3333")).collect(Collectors.toList());
    // long l2=sl.stream().filter(x->x.num.contains("3333")).count();
    System.out.println(l3.toString());
    // l3.stream().forEach(System.out::println);
}
    
}
