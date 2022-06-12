import java.util.Set;
import java.util.TreeSet;
import java.util.Comparator;

class Student implements Comparable<Student>{
    private String name;
    private int id;

    public Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    @Override
    public String toString(){
        return "Name : "+name+" ID : "+id;
    }
    @Override
    public int compareTo(Student s){
        return this.id-s.id;
    }
    String getName(){
        return name;
    }
}
class StudentComparator implements Comparator<Student>{
    public int compare(Student s1, Student s2){
        return s1.getName().compareTo(s2.getName());
    }
}

public class TreesetTest{
    public static void main(String[] args) {
        Set<Student> set=new TreeSet<Student>(new StudentComparator());
        set.add(new Student("a", 123));
        set.add(new Student("e", 324));
        set.add(new Student("c", 1123));
        set.add(new Student("a", 5643));
        set.add(new Student("b", 123));
        for(Student s : set){
            System.out.println(s);
        }
    }
}
