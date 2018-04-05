package com.example.demo.service.impl;

import com.example.demo.domain.City;
import com.example.demo.mapper.CityMapper;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> findAll() {
        return cityMapper.findAll();
    }
}
