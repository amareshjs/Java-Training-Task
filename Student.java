public class Student {
    int id;
String name;
String num;

public Student(int id,String name,String num){

this.id=id;
this.name=name;
this.num=num;
}   
    @Override
    public String toString() {
        return name;
    }

}
