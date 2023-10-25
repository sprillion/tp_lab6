package com.matyuhin.tp_lab6.models;

import com.matyuhin.tp_lab6.entity.Subject;

import java.util.List;

public class ListSubjectResponse extends Response {

    public List<Subject> subjects;

    public ListSubjectResponse(Codes codes, List<Subject> subjects){
        super(codes);
        this.subjects = subjects;
    }
}