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


      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
      Person p2 = (Person)context.getBean("Person");
      p2.setFirstName("Jane");
      p2.setLastName("Doef");
      System.out.println(p2.getName());

      context.close();


  }
}
