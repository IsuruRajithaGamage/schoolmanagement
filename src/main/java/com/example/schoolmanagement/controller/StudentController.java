package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.model.Students;
import com.example.schoolmanagement.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
