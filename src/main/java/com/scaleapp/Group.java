package com.scaleapp;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name="groops")
public class Group {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="group_name")
    private String name;

    @OneToMany(targetEntity = Student.class, cascade = CascadeType.ALL)
    @JoinColumn(name="group_id", referencedColumnName = "id")
    public List<Student> students;

}
