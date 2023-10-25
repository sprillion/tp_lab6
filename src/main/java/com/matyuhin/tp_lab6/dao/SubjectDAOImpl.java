package com.matyuhin.tp_lab6.dao;

import com.matyuhin.tp_lab6.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class SubjectDAOImpl implements SubjectDAO{

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Subject> getAllSubjects() {
        var query = entityManager.createQuery("FROM Subject");
        List<Subject> allSubjects = query.getResultList();
        return allSubjects;
    }

    @Override
    public Subject getSubject(int id) {
        return entityManager.find(Subject.class, id);
    }

    @Override
    @Transactional
    public Subject saveSubject(Subject subject) {
        return entityManager.merge(subject);
    }

    @Override
    @Transactional
    public void deleteSubject(int id) {
        var query = entityManager.createQuery("DELETE FROM Subject WHERE id =:subjectId");
        query.setParameter("subjectId", id);
        query.executeUpdate();
    }
}
