package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Students;
import com.example.schoolmanagement.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/api/v1/")
public class StudentController {


    @Autowired
    private StudentsRepository studentsRepository;

    //get all students
    @GetMapping("/students")
    public List<Students> getAllStudents(){
        return studentsRepository.findAll();
    }

    //create student
    @PostMapping("/students")
    public Students createStudent(@RequestBody Students students){
        return studentsRepository.save(students);
    }


}
