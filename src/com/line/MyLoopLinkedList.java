package com.line;

import com.base.AbstractLoopLinkedList;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/29 23:39
 * @Description: 循环链表
 */
public class MyLoopLinkedList  extends AbstractLoopLinkedList {

    private Node next;

    @Override
    public void addDown() {

    }

    @Override
    public void addUp() {

    }

    @Override
    public Object getUp(Object data) {
        return null;
    }

    @Override
    public Object getUp(int index) {
        return null;
    }

    @Override
    public Object getDown(Object data) {
        return null;
    }

    @Override
    public Object getDown(int index) {
        return null;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void remove(Object data) {

    }

    @Override
    public int indexOf(Object data) {
        return 0;
    }

    @Override
    public void print() {

    }


    private class Node{

        private Object data;

        private Node up;

        private Node down;

    }

}
