package com.example.schoolmanagement.repository;

import com.example.schoolmanagement.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentsRepository extends JpaRepository<Students,Long> {

}
