package org.leonidfrolov.spring.rest;

import org.leonidfrolov.spring.rest.configuration.MyConfig;
import org.leonidfrolov.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);

//        Employee employee = communication.getEmployee(4);
//        System.out.println(employee);


//        Employee employee = new Employee("Sveta", "Sokolova", "IT", 1100);
//        employee.setId(12);
//        communication.saveEmployee(employee);


        communication.deleteEmployee(12);


    }
}
