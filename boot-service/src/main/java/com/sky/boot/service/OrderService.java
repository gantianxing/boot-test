package com.sky.boot.service;

import com.sky.boot.domain.mongo.Order;

/**
 * Created by gantianxing on 2017/8/8.
 */
public interface OrderService {

    void save(Order order);

    Order getOrder(String id);
}
