package com.scaleapp.service;

import com.scaleapp.Student;
import com.scaleapp.data.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @Override
    public List<StudentResponseDto> getJoin(){
        return studentRepository.getJoinQuery();
    }

    @Override
    public void saveStudent (Student student){
        studentRepository.save(student);
    }

    @Override
    public Student getStudent (int id){

        return studentRepository.findById(id).
                orElseThrow(null);
    }

    @Override
    public void deleteStudent(int id){
        studentRepository.deleteById(id);
    }



}
