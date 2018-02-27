package builder;

public class Student {
    private int id;
    private String name, email;

    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /**
     * Student builder Demo Class
     * */
    static class StudentBuilder{
        private int id;
        private String name, email;

        StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        Student getInstance(){
            return new Student(id, name, email);
        }
    }
}
