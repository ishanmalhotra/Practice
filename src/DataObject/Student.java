package DataObject;

/**
 * Created by ishanmalhotra on 24/4/16.
 */
public class Student implements Comparable<Student>{

    public int id;
    public String Student;

    public Student(int id, String student) {
        this.id = id;
        Student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudent() {
        return Student;
    }

    public void setStudent(String student) {
        Student = student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", Student='" + Student + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student student) {
        if (this.id==student.id)
            return 0;
        else if (this.id>student.id)
            return 1;
        else return -1;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;

    }

    public int hashCode() {
        return id;
    }
}
