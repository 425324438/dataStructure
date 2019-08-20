package com;

import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/8/11 18:10
 * @Description:
 */
public class CollectionTest {

    public static void main(String[] args) throws Exception{

//        Map<String , Object> map = new HashMap<>();
//        map.put("123","123");
//        map.put("1223","123");
//        map.put("1233","123");map.put("123","123");map.put("123","123");
//
//        map.put("1323","123");
//        map.put("1223","123");
//        map.put("1223","123");
//
//
//
//        for(Map.Entry entry : map.entrySet()){
//            map.put("asd","");
//        }
//        map.remove("123");
//
//        map.remove("123");
//        map.remove("123");
//        map.remove("123");
//        map.remove("123");


//        List<String> list = new ArrayList<>();
//
//        list.add("12");
//
//
//        System.out.println("执行完成");

//        System.out.println(10 >> 1);
//
//        Lock lock = new ReentrantLock();
//
//        ThreadLocal<String> local = new ThreadLocal<>();
//        local.set("dede");
//
//        System.out.println(local.get());
//        System.out.println(local.get());

        CountDownLatch countDownLatch = new CountDownLatch(1);

//        if(1 == 0){

//        }

        countDownLatch.await();

        countDownLatch.countDown();



    }
}
