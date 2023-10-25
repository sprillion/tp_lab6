package com.matyuhin.tp_lab6.models;

import com.matyuhin.tp_lab6.entity.Subject;

public class SubjectResponse extends Response {

    public Subject subject;

    public SubjectResponse(Codes codes, Subject subject){
        super(codes);
        this.subject = subject;
    }
}