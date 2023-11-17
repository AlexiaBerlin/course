package com.example.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;


@SpringBootApplication
public class CourseApplication {


		public static void main(String[] args) {
      SpringApplication.run(CourseApplication.class, args);
      System.out.println("Hello World!\n");
      System.out.println("Spring Version: " + SpringVersion.getVersion());


      Person p = new Person();
      p.setFirstName("JOhn");
      p.setLastName("Doe");
      System.out.println(p.getName());
      System.out.println(p.getGender());


      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
      Person p2 = (Person)context.getBean("Person");
      p2.setFirstName("Jane");
      p2.setLastName("Doef");
      System.out.println(p2.getName());
      System.out.println(p2.getGender());
      //context.registerShutdownHook();

      Address a = new Address();
      a.setStreet("100 Park Ave");
      a.setCityState("New York City, NY");
      System.out.println(a.toString());

      Address a2 = (Address)context.getBean("address");
      System.out.println("using address injection\n");
      p2.setAddress(a2);
      System.out.println(p2.getAddress());

      context.close();
    }
}
