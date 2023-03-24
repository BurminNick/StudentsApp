package com.scaleapp.data;

import com.scaleapp.Group;
import com.scaleapp.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
    //public List<Group> findAllOrderByStudents(List<Student> students);
}
