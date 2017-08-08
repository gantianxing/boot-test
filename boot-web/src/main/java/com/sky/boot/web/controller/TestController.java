package com.sky.boot.web.controller;

import com.sky.boot.dao.dubbo.OneService;
import com.sky.boot.domain.mongo.Order;
import com.sky.boot.domain.mongo.Product;
import com.sky.boot.domain.mysql.Test;
import com.sky.boot.service.OrderService;
import com.sky.boot.service.TestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by gantianxing on 2017/8/8.
 */
@Controller
@RequestMapping("/")
public class TestController {

    @Resource
    private TestService testService;

    @Resource
    private OrderService orderService;

    @Resource
    private OneService oneService;

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map){
        map.put("hello","I am lilei");
        return "hello";
    }

    @RequestMapping("/mysql")
    public String mysql(Map<String,Object> map){
        Test test = new Test();
        test.setName("baby");
        test.setSex(true);

        testService.add(test);
        Test t2 = testService.get(8);

        map.put("hello","I am "+t2.getName());
        return "mysql";
    }

    @RequestMapping("/mongodb")
    public String mongdb(Map<String,Object> map){
        Order order = new Order();
        order.setId("10000");
        order.setCustomer("zhang san");
        order.setDesc("一个订单");

        Product p1 = new Product();
        p1.setId(1111l);
        p1.setName("小鸡手机");
        p1.setPrice(1000);
        p1.setNum(1);

        Product p2 = new Product();
        p2.setId(2222l);
        p2.setName("小小鸡手机");
        p2.setPrice(1000);
        p2.setNum(1);

        order.put(p1);
        order.put(p2);
        orderService.save(order);

        Order o1=orderService.getOrder("10000");
        map.put("order",o1);

        return "mongdb";
    }

    @RequestMapping("/dubbo")
    public String dubbo(Map<String,Object> map){
        map.put("dubbo",oneService.getPrice());
        return "dubbo";
    }
}
