import java.util.*;

public class comparator {
    static class Student {
        String name;
        int age;
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }
        }

    public static void main(String args[]){
        List<Student> group = new ArrayList<>();
        group.add(new Student("Aayat", 22));
        group.add(new Student("Hossain", 23));
        group.add(new Student("Mridha", 24));
        group.add(new Student("Rayhan", 23));

        Collections.sort(group, new Comparator<Student>(){
            public int compare(Student s1, Student s2){
                //best method
                //ascending
                return s1.age < s2.age ? -1 : 1 ;

                // //descending
                // return s1.age < s2.age ? 1 : -1 ;




                
                //ascending
                // return s1.age - s2.age;
            
                //descending
                // return s2.age - s1.age;

            }
        }
        );

        System.out.println(group);
        for(int i = 0; i < group.size(); i++){
            Student s1 = group.get(i);
            System.out.println(s1.name+" , "+ s1.age);
        }
    }
}

