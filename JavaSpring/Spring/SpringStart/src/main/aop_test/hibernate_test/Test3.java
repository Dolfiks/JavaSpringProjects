package hibernate_test;

import aoptest.Library;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test3 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {


            Session session = factory.getCurrentSession();
            session.beginTransaction();

            Employee emp = session.get(Employee.class, 1);

            System.out.println(emp);
            emp.setSalary(1200);

            session.createQuery("UPDATE Employee set salary=2222 where department = 'IT'").executeUpdate();


            session.getTransaction().commit();

            System.out.println(emp);


        } finally {
            factory.close();
        }

    }
}
