package com.tech.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tech.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

	Page<Employee> findByUserId(long userId,Pageable pageable);
}
