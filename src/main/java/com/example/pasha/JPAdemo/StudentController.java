package com.example.pasha.JPAdemo;

import com.example.pasha.JPAdemo.model.Class;
import com.example.pasha.JPAdemo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/students")

public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @RequestMapping("all")
    public List<Student> getall(){
        return studentRepository.findAll();
    }
    @RequestMapping("{id}")
    public Student getStudent(@PathVariable("id") String id){
        return studentRepository.getOne(Integer.valueOf(id));
    }
    @RequestMapping("/class{id}")
    public List<Student> getStudentClasses(@PathVariable("id") String id){
        return studentRepository.findAllByClassesId(Integer.valueOf(id));
    }
}
