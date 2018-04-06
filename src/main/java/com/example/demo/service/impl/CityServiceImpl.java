package com.example.demo.service.impl;

import com.example.demo.domain.City;
import com.example.demo.mapper.CityMapper;
import com.example.demo.service.CityService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = {RuntimeException.class, Exception.class})
public class CityServiceImpl implements CityService {

    @Autowired
    private CityMapper cityMapper;

    @Override
    public List<City> findAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<City> dataList = cityMapper.findAll();
        return dataList;
    }
}
