package com.line.test;

import com.line.MyLinkedList;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/22 23:52
 * @Description:
 */
public class MyLikndListTest {
    public static void main(String[] args) {
        MyLinkedList likd = new MyLinkedList();

        likd.add("12addsa");
        likd.add("1111");
        likd.add("222222");
        likd.add("33333");

        for (int i =0 ;i < likd.getLength();i ++){
            System.out.println(likd.get(i));
        }
        System.out.println("获取第一个元素 = " + likd.get(1));

//        //根据下标删除
//        Double v = Math.random() * 4;
//        System.out.println("随机删除一个元素");
//        likd.remove(v.intValue());
//        likd.print();

        //根据元素删除
//        likd.remove("222222");
//        likd.print();


        System.out.println("查找元素索引位置 =  "+ likd.indexOf("33333"));


        likd.print();


    }
}
