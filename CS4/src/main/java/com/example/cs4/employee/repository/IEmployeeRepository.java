package com.example.cs4.employee.repository;


import com.example.cs4.employee.model.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "select * from employees where name like :searchName and is_deleted = 0",nativeQuery = true)
    Page<Employee> findAllByFullNameContaining(@Param("searchName") String searchName, Pageable pageable);
    @Query(value = "select employee.* from employee \n" +
            "join accounts on employee.account_id = accounts.account_id\n" +
            "where accounts.username =:userName",
            nativeQuery = true)
    Employee findByUserName(@Param("userName") String userName);
}
