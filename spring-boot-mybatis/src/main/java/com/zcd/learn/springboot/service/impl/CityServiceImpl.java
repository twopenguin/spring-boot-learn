package com.zcd.learn.springboot.service.impl;

import com.zcd.learn.springboot.dao.CityDao;
import com.zcd.learn.springboot.domain.City;
import com.zcd.learn.springboot.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDao cityDao;

    public City findCityByName(String cityName) {
        return cityDao.findByName(cityName);
    }

    @Override
    public List<City> getAll() {
        return cityDao.getAll();
    }
}
