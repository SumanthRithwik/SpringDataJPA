package com.rithwik.springdatajpa.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rithwik.springdatajpa.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
