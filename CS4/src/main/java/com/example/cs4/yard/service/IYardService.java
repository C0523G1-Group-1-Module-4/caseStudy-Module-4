package com.example.cs4.yard.service;



import com.example.cs4.yard.model.Yard;

import java.util.List;

public interface IYardService {
    Yard findById(int id);
    List<Yard> findAll();
}
