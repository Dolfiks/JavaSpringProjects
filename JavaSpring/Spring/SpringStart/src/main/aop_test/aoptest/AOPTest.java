package aoptest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigLB.class);

        Book frstprsn = context.getBean("mybook", Book.class);

        frstprsn.getBook();
        System.out.println("----------------------------------------------------------------");
        frstprsn.nameBook();
        System.out.println("----------------------------------------------------------------");
        context.close();
    }
}
