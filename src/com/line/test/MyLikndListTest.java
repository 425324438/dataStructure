package com.line.test;

import com.line.LinkdList;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/22 23:52
 * @Description:
 */
public class MyLikndListTest {
    public static void main(String[] args) {
        LinkdList likd = new LinkdList();

        likd.add("12addsa");
        likd.add("1111");
        likd.add("222222");

        for (int i =0 ;i < likd.getLength();i ++){
            System.out.println(likd.get(i));
        }
    }
}
