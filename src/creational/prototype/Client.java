package creational.prototype;

public class Client {

    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.loadTemplatesInToRegistry();

        Student aprilBatchStudent = studentRegistry.getTemplate("April-LLD").clone();
        aprilBatchStudent.setId(1);
        aprilBatchStudent.setName("Bhanu");
        aprilBatchStudent.setAge(23);

        Student mayBatchStudent = studentRegistry.getTemplate("May-LLD").clone();
        mayBatchStudent.setId(2);
        mayBatchStudent.setName("Tarun");
        mayBatchStudent.setAge(25);

        System.out.println("April "+ aprilBatchStudent.getAvgBatchPsp());
        System.out.println("May "+ mayBatchStudent.getAvgBatchPsp());

    }
}
