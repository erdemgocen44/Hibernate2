package h01.annotations;


import javax.persistence.*;

@Entity // bu anootation elimizdeki objeyi Database Table ına dönüştürür
@Table(name="Student_Table")  //Table yeni isim vermemizi sağlar
public class Student {

    @Id  //bu annotation elimizdeki table için bu variable ı primary key e dönüştürür
    private int std_id;
    @Column(name="student_name")
    private String name;

    @Transient //bu annotation database için disable etmemizi sağlar yani kullanılmaz
    private String email;

    private int grade;

    public Student() {
    }

    public Student(int std_id, String name, int grade,String email) {
        this.std_id = std_id;
        this.name = name;
        this.grade = grade;
        this.email=email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getStd_id() {
        return std_id;
    }

    public void setStd_id(int std_id) {
        this.std_id = std_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "std_id=" + std_id +
                ", Student name='" + name + '\'' +
                ", Student grade=" + grade +
                '}';
    }
}
