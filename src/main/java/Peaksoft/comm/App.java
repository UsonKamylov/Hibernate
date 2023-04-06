package Peaksoft.comm;

import Peaksoft.comm.entity.Student;
import Peaksoft.comm.service.StudentServiceImpl;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.security.Provider;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StudentServiceImpl studentService=new StudentServiceImpl();
//        Student student = new Student("Aibek","Erlan uu",18);
//        Student student2 = new Student("Asan","Taiirov",24);
//        Student student3 = new Student("Bakyt","Latibov",23);
//        System.out.println(studentService.create(student));
//        System.out.println(studentService.create(student2));
//        System.out.println(studentService.create(student3));
//        System.out.println(studentService.getById(3L));
//        System.out.println(studentService.getById(4L));
        List<Student> students = studentService.getAll();
        for (Student student: studentService.getAll()) {
            System.out.println(student);

        }
    }
}
