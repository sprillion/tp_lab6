package com.matyuhin.tp_lab6.models;

import com.matyuhin.tp_lab6.entity.Student;

public class StudentResponse extends Response {

    public Student student;

    public StudentResponse(Codes codes, Student student){
        super(codes);
        this.student = student;
    }
}
