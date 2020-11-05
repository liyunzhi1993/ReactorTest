package com.example.demo.controller;

import java.util.concurrent.TimeUnit;

public class User {
    public String ss="111";
    
    public  User test() throws InterruptedException
    {
        ss="hello嗄嗄嗄嗄";
        //模拟请求1000
        TimeUnit.MILLISECONDS.sleep(1000);
        return this;
    }
}
