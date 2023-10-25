package com.matyuhin.tp_lab6.service;

import com.matyuhin.tp_lab6.entity.Student;
import com.matyuhin.tp_lab6.entity.Subject;
import org.hibernate.cfg.CannotForceNonNullableException;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NullableServiceImpl implements NullableService {

    @Override
    public Student checkStudent(Student student) {
        if (student != null) return student;
        throw new CannotForceNonNullableException("");
    }

    @Override
    public List<Student> checkStudents(List<Student> students) {
        if (students != null) return students;
        throw new CannotForceNonNullableException("");
    }

    @Override
    public Subject checkSubject(Subject subject) {
        if (subject != null) return subject;
        throw new CannotForceNonNullableException("");
    }

    @Override
    public List<Subject> checkSubjects(List<Subject> subjects) {
        if (subjects != null) return subjects;
        throw new CannotForceNonNullableException("");
    }
}
