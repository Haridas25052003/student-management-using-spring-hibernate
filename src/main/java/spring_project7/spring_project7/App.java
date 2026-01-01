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
       
       String[] names = {
    		    "Aarav", "Amit", "Anil", "Arjun", "Ashok",
    		    "Bhavesh", "Bharat", "Chetan", "Deepak", "Dinesh",
    		    "Ganesh", "Gaurav", "Harish", "Hemant", "Irfan",
    		    "Jatin", "Karan", "Kishore", "Krishna", "Lokesh",
    		    "Mahesh", "Manoj", "Mayur", "Mukesh", "Nagesh",
    		    "Narendra", "Nikhil", "Pankaj", "Prakash", "Rahul",
    		    "Rajesh", "Ramesh", "Ravi", "Rohit", "Sachin",
    		    "Sagar", "Sandeep", "Sanjay", "Santosh", "Shivam",
    		    "Shubham", "Siddharth", "Sunil", "Suraj", "Swapnil",
    		    "Tanmay", "Uday", "Vaibhav", "Vikas", "Vijay",
    		    "Vinay", "Vishal", "Yash", "Abhishek", "Aditya",
    		    "Ajay", "Akash", "Akhil", "Anoop", "Ankit",
    		    "Ankur", "Apoorva", "Aryan", "Atul", "Avinash",
    		    "Chandrakant", "Darshan", "Dhruv", "Girish", "Hardik",
    		    "Jay", "Jeevan", "Kunal", "Milan", "Mohit",
    		    "Nitin", "Omkar", "Parth", "Piyush", "Rajat",
    		    "Rohini", "Sameer", "Shailesh", "Tejas", "Yogesh"
    		};

       String[] cities = {
    		    "Mumbai", "Pune", "Nagpur", "Nashik", "Aurangabad",
    		    "Delhi", "Noida", "Gurgaon", "Faridabad", "Ghaziabad",
    		    "Bengaluru", "Mysuru", "Mangaluru", "Hubli", "Belagavi",
    		    "Hyderabad", "Secunderabad", "Warangal", "Nizamabad", "Karimnagar",
    		    "Chennai", "Coimbatore", "Madurai", "Salem", "Tiruchirappalli",
    		    "Kolkata", "Howrah", "Durgapur", "Asansol", "Siliguri",
    		    "Ahmedabad", "Surat", "Vadodara", "Rajkot", "Bhavnagar",
    		    "Jaipur", "Jodhpur", "Udaipur", "Kota", "Ajmer",
    		    "Indore", "Bhopal", "Gwalior", "Jabalpur", "Ujjain"
    		};

       for(int i=1;i<=100;i++) {
       Student s=new Student();
       
       s.setName(names[r.nextInt(names.length)]);
       s.setCity(cities[r.nextInt(cities.length)]);
       s.setFees(2000+r.nextInt(5000));
       
       System.out.println(es.insertStudent(s));
       }
    }
}
