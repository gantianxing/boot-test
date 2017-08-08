package com.sky.boot.service.impl;

import com.sky.boot.dao.mysql.TestMapper;
import com.sky.boot.domain.mysql.Test;
import com.sky.boot.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by gantianxing on 2017/8/8.
 */
@Service
public class TestServiceImpl implements TestService{

    @Resource
    private TestMapper testMapper;

    @Override
    public void add(Test test) {
        testMapper.insert(test);
    }

    @Override
    public Test get(int id) {
        return testMapper.selectByPrimaryKey(id);
    }
}
