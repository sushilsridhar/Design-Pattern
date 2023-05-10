package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<String, Student> map;

    public StudentRegistry() {
        this.map = new HashMap<>();
    }

    public void addTemplateToRegistry(Student student) {
        map.put(student.getBatchName(), student);
    }

    public Student getTemplate(String batchName) {
        return map.get(batchName);
    }

    public void loadTemplatesInToRegistry() {
        Student aprilBatch = new Student();
        aprilBatch.setAvgBatchPsp(80);
        aprilBatch.setBatchName("April-LLD");
        aprilBatch.setYearOfEnrollment(2022);
        addTemplateToRegistry(aprilBatch);

        Student mayBatch = new Student();
        mayBatch.setAvgBatchPsp(85);
        mayBatch.setBatchName("May-LLD");
        mayBatch.setYearOfEnrollment(2022);
        addTemplateToRegistry(mayBatch);

        Student janBatch = new Student();
        janBatch.setAvgBatchPsp(100);
        janBatch.setBatchName("Jan-LLD");
        janBatch.setYearOfEnrollment(2023);
        addTemplateToRegistry(janBatch);

        IntelligentStudent intelligentAprilBatch = new IntelligentStudent();
        intelligentAprilBatch.setAvgBatchPsp(80);
        intelligentAprilBatch.setBatchName("Intelligent-April-LLD");
        intelligentAprilBatch.setYearOfEnrollment(2022);
        intelligentAprilBatch.setIq(100);
        addTemplateToRegistry(intelligentAprilBatch);
    }
}
