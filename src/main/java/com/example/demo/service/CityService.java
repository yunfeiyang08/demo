package com.example.demo.service;

import com.example.demo.domain.City;

import java.util.List;

public interface CityService {

    List<City> findAll(int pageNum, int pageSize);
}
