package com.springboot.practice2.controller;

import com.springboot.practice2.model.Student;
import com.springboot.practice2.service.impl.StudentServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class StudentController {
private final StudentServiceImpl studentServiceimpl;

//    @PostMapping("/addStudentData")
//    public String addStudent(@RequestBody Student student)
//    {
//        studentServiceimpl.saveStudent(student);
//        return "Record Inserted Sucessfully";
//    }

    @PostMapping("/addStudentData")
    public String addStudent(@RequestBody Student student)
    {
         studentServiceimpl.saveStudent(student);
        return "Record Inserted Sucessfully";
    }


}
