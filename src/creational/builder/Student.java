package creational.builder;

/*
    psp > 80, gradYear < 2023, age > 18
*/
public class Student {
    private int id;
    private int psp;
    private int yoe;
    private String name;
    private int gradYear;
    private int age;

    private Student(Builder builder) {
        this.id = builder.id;
        this.psp = builder.psp;
        this.yoe = builder.yoe;
        this.name = builder.name;
        this.gradYear = builder.gradYear;
        this.age = builder.age;
    }

    // STEP 1
    // because we should validate before creating student object so builder method is static
    public static Builder builder() throws Exception {
        return new Builder();
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

    static class Builder {
        private int id;
        private int psp;
        private int yoe;
        private String name;
        private int gradYear;
        private int age;

        private Builder(){}

        // STEP 3
        // validate the builder object and create student object on successful validation
        public Student build() throws Exception {
            if(gradYear >= 2023) {
                throw new Exception("Grad year is not valid");
            }

            if(age < 20) {
                throw new Exception("Age is not valid");
            }

            if(psp < 80) {
                throw new Exception("PSP is not valid");
            }

            Student student = new Student(this);
            return student;
        }

        // STEP 2
        // use setter methods to set values to builder object
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setPsp(int psp) {
            this.psp = psp;
            return this;
        }

        public Builder setYoe(int yoe) {
            this.yoe = yoe;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }
    }
}
