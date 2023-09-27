package vn.com.edu.iuh.fit;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import vn.com.edu.iuh.fit.models.Employee;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("hien.xml");
        Employee emp1 = ctx.getBean("e1",Employee.class);
        Employee emp2 = ctx.getBean("e2",Employee.class);
        emp1.show();
        emp2.show();



    }
}