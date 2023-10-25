package com.matyuhin.tp_lab6.service;

import com.matyuhin.tp_lab6.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface SubjectService {
    List<Subject> getAllSubjects();
    Subject getSubject(int id);
    Subject saveSubject(Subject subject);
    void deleteSubject(int id);
}
