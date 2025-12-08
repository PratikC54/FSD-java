import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class student{
    String name;
    int marks;
    public student(String name,int marks) {
        this.name = name;
        this .marks = marks;
    }
    public String toString(){
        return name+" "+marks;
    }
}
public class ObjectSorting {
    public static void main(String[] args) {
        List<student> list = new ArrayList<>();
        list.add(new student("Pratik",100));
        list.add(new student("Pradeep",10));
        list.sort(Comparator.comparing(s->s.marks));
        System.out.println(list);
    }
}
