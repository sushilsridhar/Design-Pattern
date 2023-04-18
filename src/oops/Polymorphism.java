package oops;

public class Polymorphism {
    public static void main(String[] args) {

        TA ta = new TA("TA", "ta@scaler.com");
        Mentor mentor = new Mentor("Mentor", "mentor@scaler.com");
        Student student = new Student("Student", "student@scaler.com");

        printName(ta);
        printName(mentor);
        printName(student);
    }

    // Abstraction - this method is abstracted out from object being passed
    public static void printName(User user) {
        System.out.println(user.getName());
    }
}

class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }
}

class TA extends User {

    public TA(String name, String email) {
        super(name, email);
    }
}

class Mentor extends User {

    public Mentor(String name, String email) {
        super(name, email);
    }
}

class Student extends User {

    public Student(String name, String email) {
        super(name, email);
    }
}