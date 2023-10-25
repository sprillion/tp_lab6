package com.matyuhin.tp_lab6.models;

import com.matyuhin.tp_lab6.entity.Student;

import java.util.List;

public class ListStudentsResponse extends Response {

    public List<Student> students;

    public ListStudentsResponse(Codes codes, List<Student> students){
        super(codes);
        this.students = students;
    }
}
