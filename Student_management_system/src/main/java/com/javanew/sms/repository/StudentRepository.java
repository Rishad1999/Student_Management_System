package com.javanew.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javanew.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>
{
	

}
