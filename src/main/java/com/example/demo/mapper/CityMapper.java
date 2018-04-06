package com.example.demo.mapper;

import com.example.demo.domain.City;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<City> findAll();
}