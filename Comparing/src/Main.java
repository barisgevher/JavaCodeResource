import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

       Integer five = 5;
       Integer[] others = {0, 5, 10, -50, 50};

       for (Integer i : others) {
           int val = five.compareTo(i);
           System.out.printf("%d %s %d: compareTo=%d\n", five,
                   (val == 0 ? "==" : (val < 0) ? "<" : ">"), i, val);

       }

       String banana = "banana";
       String[] fruits = {"apple", "orange", "banana", "BANANA", "ORANGE"};
       for (String fruit : fruits) {
           int val = banana.compareTo(fruit);
           System.out.printf("%s %s %s: compareTo = %d\n", banana, (val == 0 ? "==" : (val < 0) ? "<" : ">"), fruit, val);
       }

        Arrays.sort(fruits);
        System.out.println(Arrays.toString(fruits));

        System.out.println("A:" + (int)'A' + " " + "a:" + (int)'a');
        System.out.println("B:" + (int)'B' + " " + "b:" + (int)'b');
        System.out.println("P:" + (int)'P' + " " + "p:" + (int)'p');


        Student tim = new Student("Tim");

        Student[] students = {new Student("Zach"), new Student("Tim"), new Student("Ann")};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo(new Student("tim")));


        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());  // gpaSorter.reversed() comparatoru ters çevirir
        System.out.println(Arrays.toString(students));


    }
}

//class Student implements Comparable{
//    private String name;
//
//    public Student(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return name;
//    }
//
//
//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }
//}

class StudentGPAComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
//        return (o2.gpa + o2.name).compareTo(o1.gpa + o1.name);   // default ascending a->z
        return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);   // default ascending a->z
    }
}

class Student implements Comparable<Student> {

    private static int LAST_ID = 1000;
    private  static Random random = new Random();


   String name;
    private int id;
    protected double gpa;



    public Student(String name) {
        this.name = name;
        id = LAST_ID++;
        gpa = random.nextDouble(1.0, 4.0);
    }

    @Override
    public String toString() {
        return "%d - %s (%.2f)".formatted(id, name, gpa);
    }


    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
    }


}