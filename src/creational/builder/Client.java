package creational.builder;

public class Client {
    public static void main(String[] args) throws Exception {

        Student s = Student.builder()
                    .setId(1)
                    .setName("James")
                    .setAge(29)
                    .setPsp(80)
                    .setYoe(25)
                    .setGradYear(2015).build();

        System.out.println(s.getAge());
        System.out.println(s.getPsp());
    }
}
