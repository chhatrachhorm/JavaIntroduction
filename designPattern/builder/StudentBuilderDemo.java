package builder;

import builder.model.Student;

public class StudentBuilderDemo {
    public static void main(String[] args) {
        Student stu = new Student.StudentBuilder()
                .setId(12345)
                .setEmail("emaildemo@email.com")
                .getInstance();
        System.out.println(stu);
    }

}
