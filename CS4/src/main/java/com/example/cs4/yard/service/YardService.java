package com.example.cs4.yard.service;


import com.example.cs4.yard.model.Yard;
import com.example.cs4.yard.repository.IYardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YardService implements IYardService{
    @Autowired
    private IYardRepository yardRepository;
    @Override
    public Yard findById(int id) {
        return yardRepository.findById(id).get();
    }

    @Override
    public List<Yard> findAll() {
        return yardRepository.findAll();
    }
}
