package creational.builder;

public class Client {
    public static void main(String[] args) throws Exception {

        // not a good idea, as we are passing params,
        // there can two integer type which might be passed wrongly
        Student s = Student.getStudentObject(1, 81, 2, "Jaina", 2018, 25);

        System.out.println(s.getName());
        System.out.println(s.getAge());

        Student s1 = Student.getStudentObject(1, 81, 2, "Amit", 2018, 17);
    }
}
