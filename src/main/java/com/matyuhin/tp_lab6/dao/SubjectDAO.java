package com.matyuhin.tp_lab6.dao;

import com.matyuhin.tp_lab6.entity.Subject;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectDAO {
    List<Subject> getAllSubjects();
    Subject getSubject(int id);
    Subject saveSubject(Subject subject);
    void deleteSubject(int id);
}
