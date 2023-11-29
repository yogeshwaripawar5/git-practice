package com.springboot.practice2.repositories;

import com.springboot.practice2.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
