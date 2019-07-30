package com.line;

import com.base.AbstractDoubleLinkedList;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/29 23:39
 * @Description: 双向链表
 */
public class MyDoubleLinkedList extends AbstractDoubleLinkedList {

    private Node next;

    @Override
    public void addDown(Object data) {
        if(this.next == null){
            this.next = new Node(data, null, null);
        } else {
            this.next.add(data, null, next.getDown());
        }
    }

    @Override
    public void addUp(Object data) {

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
        Node node = this.next;
        while (node.getDown() != null){
            System.out.print(String.valueOf(node.getData()));
            System.out.print(", ");
            node = node.getDown();
        }
        System.out.println("结束");
    }


    private class Node{

        private Object data;

        private Node up;

        private Node down;

        private Node(Object data, Node up, Node down) {
            this.data = data;
            this.up = up;
            this.down = down;
        }

        public void add(Object data, Node up, Node down){
            //向上插入
            if(up != null){

            } else
            //向下插入
            if(down != null){

            }
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getUp() {
            return up;
        }

        public void setUp(Node up) {
            this.up = up;
        }

        public Node getDown() {
            return down;
        }

        public void setDown(Node down) {
            this.down = down;
        }
    }

}
