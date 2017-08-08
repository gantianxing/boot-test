package com.sky.boot.service;

import com.sky.boot.domain.mysql.Test;

/**
 * Created by gantianxing on 2017/8/8.
 */
public interface TestService {

    void add(Test test);

    Test get(int id);
}
