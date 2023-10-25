package com.matyuhin.tp_lab6.service;

import com.matyuhin.tp_lab6.dao.SubjectDAO;
import com.matyuhin.tp_lab6.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubjectServiceImpl implements SubjectService{

    @Autowired
    private SubjectDAO subjectDAO;

    @Override
    public List<Subject> getAllSubjects() {
        return subjectDAO.getAllSubjects();
    }

    @Override
    public Subject getSubject(int id) {
        return subjectDAO.getSubject(id);
    }

    @Override
    public Subject saveSubject(Subject subject) {
        return subjectDAO.saveSubject(subject);
    }

    @Override
    public void deleteSubject(int id) {
        subjectDAO.deleteSubject(id);
    }
}
