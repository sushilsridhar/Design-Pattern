package creational.builder.rough;

public class Helper {
    private int id;
    private int psp;
    private int yoe;
    private String name;
    private int gradYear;
    private int age;

    public Helper(int id, int psp, int yoe, String name, int gradYear, int age) throws Exception {

        if(gradYear >= 2023) {
            throw new Exception("Grad year is not valid");
        }

        if(age < 20) {
            throw new Exception("Age is not valid");
        }

        if(psp < 80) {
            throw new Exception("PSP is not valid");
        }

        this.id = id;
        this.psp = psp;
        this.yoe = yoe;
        this.name = name;
        this.gradYear = gradYear;
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public void setYoe(int yoe) {
        this.yoe = yoe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setAge(int age) {
        this.age = age;
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
