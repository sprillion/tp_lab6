package com.matyuhin.tp_lab6.controller;

import com.matyuhin.tp_lab6.entity.Subject;
import com.matyuhin.tp_lab6.models.*;
import com.matyuhin.tp_lab6.service.NullableService;
import com.matyuhin.tp_lab6.service.SubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api")

public class SubjectsRouting {
    @Autowired
    private SubjectService subjectService;

    @Autowired
    private NullableService nullableService;


    @GetMapping("/subjects")
    public Response showAllSubject(){
        try {
            var subjects = nullableService.checkSubjects(subjectService.getAllSubjects());
            return new ListSubjectResponse(Codes.SUCCESS, subjects);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @GetMapping("/subjects/{id}")
    public Response getSubject(@PathVariable("id") int id){
        try {
            var subject = nullableService.checkSubject(subjectService.getSubject(id));
            return new SubjectResponse(Codes.SUCCESS, subject);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @PostMapping("/subjects")
    public Response saveSubject(@RequestBody Subject subject){
        try {
            subject = nullableService.checkSubject(subjectService.saveSubject(subject));
            return new SubjectResponse(Codes.SUCCESS, subject);
        }catch (Exception exception){
            log.info(exception.getMessage());
            return new Response(Codes.FAILED);
        }
    }

    @PutMapping("/subjects")
    public Response updateSubject(@RequestBody Subject subject){
        try {
            subject = nullableService.checkSubject(subjectService.saveSubject(subject));
            return new SubjectResponse(Codes.SUCCESS, subject);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @DeleteMapping("/subjects/{id}")
    public Response deleteSubject(@PathVariable("id") int id){
        try {
            subjectService.deleteSubject(id);
            return new Response(Codes.SUCCESS);
        }catch (Exception exception){
            log.info(exception.getMessage());
            return new Response(Codes.FAILED);
        }
    }
}
