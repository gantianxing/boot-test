package com.sky.boot.dao.mongo;

import com.sky.boot.domain.mongo.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by gantianxing on 2017/8/8.
 */
public interface OrderRepository extends MongoRepository<Order,String> {

}
