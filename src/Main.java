import java.util.HashMap;
import java.util.HashSet;


public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("hung",20,"Hn");
        Student student2 = new Student("le",23,"Hn");
        Student student3 = new Student("tuan",21,"Hn");

       HashMap<Integer, Student> map =new HashMap<Integer, Student>();
        map.put(1 , student1);
        map.put(2 , student2);
        map.put(3 , student3);

        for (HashMap.Entry<Integer, Student> student : map.entrySet()){
            System.out.println(student.toString());

        }
        System.out.println();
        HashSet<Student>studentSet=new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        for (Student student :studentSet){
            System.out.println(student.toString());
        }
    }
        


}


