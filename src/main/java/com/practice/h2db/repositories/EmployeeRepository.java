package com.practice.h2db.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.h2db.entities.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
