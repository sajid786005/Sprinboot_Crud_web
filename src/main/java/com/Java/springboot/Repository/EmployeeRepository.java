package com.Java.springboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Java.springboot.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>  {

	

}
