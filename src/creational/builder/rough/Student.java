package creational.builder.rough;

// psp > 80, gradYear < 2023, age > 18
public class Student {
    private int id;
    private int psp;
    private int yoe;
    private String name;
    private int gradYear;
    private int age;

    public Student(Helper helper) {
        this.id = helper.getId();
        this.psp = helper.getPsp();
        this.yoe = helper.getYoe();
        this.name = helper.getName();
        this.gradYear = helper.getGradYear();
        this.age = helper.getAge();
    }

    // we are passing too many params, there can be two ints which can passed wrongly, fix it
    public static Student getStudentObject(int id, int psp, int yoe, String name, int gradYear, int age) throws Exception {

        Helper helper = new Helper(id, psp, yoe, name, gradYear, age);
        Student student = new Student(helper);
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
