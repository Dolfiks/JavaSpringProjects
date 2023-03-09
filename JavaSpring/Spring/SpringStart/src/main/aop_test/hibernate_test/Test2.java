package hibernate_test;

import aoptest.Library;
import hibernate_test.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {

            Session session = factory.getCurrentSession();
            session.beginTransaction();

            List<Employee> emp = session.createQuery("from Employee where department = 'IT' AND salary >1000").getResultList();

            System.out.println("--------------------------------------");
            for (Employee e : emp) {
                System.out.println(e);
            }
            System.out.println("--------------------------------------");

            session.getTransaction().commit();


        } finally {
            factory.close();
        }

    }
}
