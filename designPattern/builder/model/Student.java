package builder.model;

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
    public static class StudentBuilder{
        private int id;
        private String name, email;

        public StudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Student getInstance(){
            return new Student(id, name, email);
        }
    }
}
