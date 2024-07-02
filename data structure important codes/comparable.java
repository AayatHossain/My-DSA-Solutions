import java.util.*;

public class comparable {
    static class Student implements Comparable<Student>{
        String name;
        int age;
        public Student(String name, int age){
            this.name = name;
            this.age = age;
        }
        @Override
        public int compareTo(Student that){

            //ascending
            // return that.age - this.age;


            //ascending
            // return this.age - that.age;


            //if else are  better options.

            // //ascending
            // if(this.age > that.age){
            //     return 1;
            // }else{
            //     return -1;
            // }


            // //descending, just swap signs
            // if(this.age > that.age){
            //     return -1;
            // }else{
            //     return 1;
            // }






            //ternary is the best ig.
            //ascending
            // return this.age < that.age ? -1 : 1 ;


            //descending
            return this.age < that.age ? 1 : -1 ;




        }

    }
    public static void main(String args[]){
        List<Student> group = new ArrayList<>();
        group.add(new Student("Aayat", 22));
        group.add(new Student("Hossain", 23));
        group.add(new Student("Mridha", 24));
        group.add(new Student("Rayhan", 23));

        Collections.sort(group);

        System.out.println(group);
        for(int i = 0; i < group.size(); i++){
            Student s1 = group.get(i);
            System.out.println(s1.name+" , "+ s1.age);
        }
    }
}
