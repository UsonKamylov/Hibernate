package Peaksoft.comm.service;

import Peaksoft.comm.Util.HibernateUtil;
import Peaksoft.comm.entity.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl {
    public Long create(Student student){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(student);
        session.getTransaction().commit();
        session.close();
        System.out.println("SuccessFull create student");
        return student.getId();
    }
    public Student getById(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return student;
    }
    public List<Student> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        List<Student> students =
        session.createQuery("FROM Student").getResultList();
        session.getTransaction().commit();
        session.close();
        return students;
    }
}
