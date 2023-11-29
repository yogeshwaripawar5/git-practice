package com.springboot.practice2.service.impl;

import com.springboot.practice2.model.Student;
import com.springboot.practice2.repositories.StudentRepo;
import com.springboot.practice2.service.StudentService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    private final StudentRepo studentRepo;

    @Override
    public Student saveStudent(Student student) {
        return studentRepo.save(student);
       // return "Record Inserted Succesfully";
    }


}
