package com.example.demo.web;

import com.example.demo.domain.City;
import com.example.demo.service.CityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getHome(int pageNum, int pageSize, ModelMap modelMap) {
        List<City> citys = cityService.findAll(pageNum, pageSize);
        System.out.println("====" + citys.size());
        modelMap.put("time", new Date());
        modelMap.put("message", "hello spring boot");
        return "index";
    }

}
