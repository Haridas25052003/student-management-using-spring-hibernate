package spring_project7.spring_project7;

import java.util.Random;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.MyConfiguration;
import com.model.Student;
import com.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context=new AnnotationConfigApplicationContext(MyConfiguration.class);
       
       StudentService es=context.getBean(StudentService.class);
       
       Random r=new Random();
       
       
       for(int i=1;i<=100;i++) {
       Student s=new Student();
       
       s.setName(names[r.nextInt(names.length)]);
       s.setCity(cities[r.nextInt(cities.length)]);
       s.setFees(2000+r.nextInt(5000));
       
       System.out.println(es.insertStudent(s));
       }
    }
}
