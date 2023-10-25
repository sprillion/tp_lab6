package com.matyuhin.tp_lab6.controller;

import com.matyuhin.tp_lab6.entity.Student;
import com.matyuhin.tp_lab6.models.Codes;
import com.matyuhin.tp_lab6.models.ListStudentsResponse;
import com.matyuhin.tp_lab6.models.Response;
import com.matyuhin.tp_lab6.models.StudentResponse;
import com.matyuhin.tp_lab6.service.NullableService;
import com.matyuhin.tp_lab6.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")

public class StudentsRouting {

    @Autowired
    private StudentService studentService;

    @Autowired
    private NullableService nullableStudent;


    @GetMapping("/students")
    public Response showAllStudents(){
        try {
            var students = nullableStudent.checkStudents(studentService.getAllStudents());
            return new ListStudentsResponse(Codes.SUCCESS, students);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @GetMapping("/students/{id}")
    public Response getStudent(@PathVariable("id") int id){
        try {
            var student = nullableStudent.checkStudent(studentService.getStudent(id));
            return new StudentResponse(Codes.SUCCESS, student);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @PostMapping("/students")
    public Response saveStudent(@RequestBody Student student){
        try {
            student = nullableStudent.checkStudent(studentService.saveStudent(student));
            return new StudentResponse(Codes.SUCCESS, student);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @PutMapping("/students")
    public Response updateStudent(@RequestBody Student student){
        try {
            student = nullableStudent.checkStudent(studentService.saveStudent(student));
            return new StudentResponse(Codes.SUCCESS, student);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }

    @DeleteMapping("/students/{id}")
    public Response deleteStudent(@PathVariable("id") int id){
        try {
            studentService.deleteStudent(id);
            return new Response(Codes.SUCCESS);
        }catch (Exception exception){
            return new Response(Codes.FAILED);
        }
    }
}
