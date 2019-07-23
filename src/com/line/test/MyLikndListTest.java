package com.line.test;

import com.line.LinkedList;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/22 23:52
 * @Description:
 */
public class MyLikndListTest {
    public static void main(String[] args) {
        LinkedList likd = new LinkedList();

        likd.add("12addsa");
        likd.add("1111");
        likd.add("222222");
        likd.add("33333");

        for (int i =0 ;i < likd.getLength();i ++){
            System.out.println(likd.get(i));
        }
        System.out.println("获取第一个元素 = " + likd.get(1));

        Double v = Math.random() * 4;
        System.out.println("随机删除一个元素");
        likd.remove(v.intValue());
        likd.print();
    }
}
