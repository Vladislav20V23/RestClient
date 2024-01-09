package com.spring.rest;

import com.spring.rest.configuration.Config;
import com.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class mainClass {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        Communication communication = context.getBean("communication", Communication.class);

/*       List<Employee> allEmployees = communication.getAllEmployees();             // getAllEmployees
       System.out.println(allEmployees);*/


       /* Employee empById = communication.getEmployee(1);            // getEmployee
        System.out.println(empById);*/


/*
        Employee employee = new Employee("Bir", "Zhdunov", "Piar", 45000);  //saveEmployee or put
        employee.setId(22);
        communication.saveEmployee(employee);
*/

        communication.deletedEmployee(400);                 // deletedEmployee




    }

}
