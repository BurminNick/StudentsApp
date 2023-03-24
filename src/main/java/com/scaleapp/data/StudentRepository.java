package com.scaleapp.data;

import com.scaleapp.Student;
import com.scaleapp.service.StudentResponseDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    @Query("SELECT new com.scaleapp.service.StudentResponseDto(s.id, s.name, s.date, g.name) FROM Student s join Group g on (s.group=g.id)")
    List<StudentResponseDto> getJoinQuery();
}
