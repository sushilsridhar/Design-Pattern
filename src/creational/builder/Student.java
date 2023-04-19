package creational.builder;

// psp > 80, gradYear < 2023, age > 18
public class Student {
    private int id;
    private int psp;
    private int yoe;
    private String name;
    private int gradYear;
    private int age;

    public Student(Builder builder) {
        this.id = builder.getId();
        this.psp = builder.getPsp();
        this.yoe = builder.getYoe();
        this.name = builder.getName();
        this.gradYear = builder.getGradYear();
        this.age = builder.getAge();
    }

    public static Student getStudentObject(int id, int psp, int yoe, String name, int gradYear, int age) throws Exception {

        Builder builder = new Builder(id, psp, yoe, name, gradYear, age);
        Student student = new Student(builder);
        return student;
    }

    public int getId() {
        return id;
    }

    public int getPsp() {
        return psp;
    }

    public int getYoe() {
        return yoe;
    }

    public String getName() {
        return name;
    }

    public int getGradYear() {
        return gradYear;
    }

    public int getAge() {
        return age;
    }
}
