package com.example.cs4.yard.repository;


import com.example.cs4.yard.model.Yard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IYardRepository extends JpaRepository<Yard, Integer> {
}
