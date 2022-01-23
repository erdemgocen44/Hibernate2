package h01.annotations;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class RunnerSave01 {
    public static void main(String[] args) {


        //                         std_id  student_name  grade email
        Student std1 = new Student(101, "Akif Emre","", 13);
        Student std2 = new Student(102, "Ayşe Mine","" ,14);



        Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class);
        SessionFactory sf  = con.buildSessionFactory();
        Session session = sf.openSession();

        Transaction tx = session.beginTransaction();


        session.save(std1);
        session.save(std2);


        tx.commit();
    }
}
