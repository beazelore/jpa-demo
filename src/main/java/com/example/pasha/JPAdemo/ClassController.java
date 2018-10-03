package com.example.pasha.JPAdemo;

import com.example.pasha.JPAdemo.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/classes")
public class ClassController {
    @Autowired
    ClassRepository classRepository;
    @RequestMapping("/all")
    public List<Class> getall(){
        return classRepository.findAll();
    }
    @RequestMapping("{id}")
    public Class getOne(@PathVariable("id") String id){
        return classRepository.getOne(Integer.valueOf(id));
    }
    @RequestMapping("/student{id}")
    public List<Class> getStudentClasses(@PathVariable("id") String id){
        return classRepository.findByStudentsId(Integer.valueOf(id));
    }
}
