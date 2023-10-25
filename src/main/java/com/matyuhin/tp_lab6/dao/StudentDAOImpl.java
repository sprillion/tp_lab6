package com.matyuhin.tp_lab6.dao;

import com.matyuhin.tp_lab6.entity.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Slf4j
@Repository
public class StudentDAOImpl implements StudentDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Student> getAllStudents() {
        var query = entityManager.createQuery("FROM Student");
        List<Student> allStudents = query.getResultList();
        log.info("getAllStudents" + allStudents);
        return allStudents;
    }

    @Override
    public Student getStudent(int id) {
        return entityManager.find(Student.class, id);
    }

    @Override
    public Student saveStudent(Student student) {
        log.info(student.getName());
        return entityManager.merge(student);
    }

    @Override
    public void deleteStudent(int id) {
        var query = entityManager.createQuery("DELETE FROM Student WHERE id =:studentId");
        query.setParameter("studentId", id);
        query.executeUpdate();
    }
}
