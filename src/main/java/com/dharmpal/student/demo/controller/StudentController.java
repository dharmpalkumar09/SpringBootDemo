package com.dharmpal.student.demo.controller;

import com.dharmpal.student.demo.model.Student;
import com.dharmpal.student.demo.model.UpdateStatus;
import com.dharmpal.student.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Dharmpal
 * This class is used to manipulate request from controller
 *
 */



@RestController
@RequestMapping("/student")
public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//    /*
//    1. create
//    2. readAll, readID
//    3 update
//    4. delete
//     */
//
//    @GetMapping(value = "/getAll",produces = MediaType.APPLICATION_JSON_VALUE)
//    public List<Student> getAll(){
//
//        //TODO:
//
//        /*
//         *
//         *
//         *
//         */
//
//
//        return studentService.getAll();
//    }
//
//    @PostMapping(value = "/create",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
//    public Student createStudent(@RequestBody Student student){
//
//
//
//
//
//
//        return studentService.createStudent(student);
//    }
//
//    @GetMapping(value = "/getOne/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
//    public Student getOne(@PathVariable Long id){
//
//        return studentService.getOne(id);
//    }
//
//    @PutMapping(value = "update/{id}",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
//    public UpdateStatus updateStudent(@RequestBody Student student,@PathVariable Long id){
//        return studentService.updateStudent(student,id);
//    }

}
