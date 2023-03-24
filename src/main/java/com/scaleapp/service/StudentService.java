package com.scaleapp.service;

import com.scaleapp.Student;

import java.util.List;

public interface StudentService {

    public List<StudentResponseDto> getJoin();
    public List<Student> getAllStudents();

    public void saveStudent (Student student);

    public Student getStudent (int id);

    public void deleteStudent(int id);
}
