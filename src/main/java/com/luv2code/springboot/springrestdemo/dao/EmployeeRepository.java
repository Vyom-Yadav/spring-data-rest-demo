package com.luv2code.springboot.springrestdemo.dao;

import com.luv2code.springboot.springrestdemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "members") // 8080/members
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // that's it, no need of writing impl for basic methods, spring data JPS handles it.
}
