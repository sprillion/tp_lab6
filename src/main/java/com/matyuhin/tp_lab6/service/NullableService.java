package com.matyuhin.tp_lab6.service;

import com.matyuhin.tp_lab6.entity.Student;
import com.matyuhin.tp_lab6.entity.Subject;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface NullableService {
    Student checkStudent(Student student);
    List<Student> checkStudents(List<Student> students);

    Subject checkSubject(Subject subject);
    List<Subject> checkSubjects(List<Subject> subjects);
}
