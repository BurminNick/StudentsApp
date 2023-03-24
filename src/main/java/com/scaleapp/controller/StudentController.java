package com.scaleapp.controller;

import com.scaleapp.Student;
import com.scaleapp.service.StudentResponseDto;
import com.scaleapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> showAllStudents(){
       List<Student> allStudents = studentService.getAllStudents();

        return allStudents.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
    }

    @GetMapping("/join")
    public List<StudentResponseDto> getJoinQuery(){
        return studentService.getJoin();
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable int id){
        Student student = studentService.getStudent(id);
        return student;
    }

    @PostMapping
    public Student addNewStudent (@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @PutMapping
    public Student updateStudent (@RequestBody Student student){
        studentService.saveStudent(student);
        return student;
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
