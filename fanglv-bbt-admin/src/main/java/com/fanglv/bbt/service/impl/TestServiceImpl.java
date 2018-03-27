package com.fanglv.bbt.service.impl;

import com.fanglv.bbt.entity.Test;
import com.fanglv.bbt.mapper.TestMapper;
import com.fanglv.bbt.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xiong on 2018/3/27.
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public Test getTest(Integer id) {
        Test test = testMapper.selectById(id);
        return test;
    }
}
