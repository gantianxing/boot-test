package com.sky.boot.service.impl;

import com.sky.boot.dao.mongo.OrderRepository;
import com.sky.boot.domain.mongo.Order;
import com.sky.boot.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by gantianxing on 2017/8/8.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderRepository repository;

    @Override
    public void save(Order order) {
        repository.save(order);
    }

    @Override
    public Order getOrder(String id) {
        return repository.findOne(id);
    }
}
