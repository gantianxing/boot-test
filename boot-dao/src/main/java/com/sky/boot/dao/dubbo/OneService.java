package com.sky.boot.dao.dubbo;

/**
 * Created by gantianxing on 2017/8/8.
 */
public class OneService {

    private String zkAddress;

    private String alias;

    public OneService(String zkAddress, String alias) {
        this.zkAddress = zkAddress;
        this.alias = alias;
    }

    public String getPrice(){
        System.out.println(zkAddress+":"+alias);
        return "$12.01";
    }
}
