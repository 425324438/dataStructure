package com.line;

import com.base.AbstractList;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/22 23:34
 * @Description: 链表实现的list
 */
public class LinkedList extends AbstractList {

    private Next next;

    private int length;

    /**
     * 向集合内添加数据
     */
    public void add(Object data){
        if(this.next == null){
            this.next = new Next(data);
        } else {
            this.next.add(data);
        }
        this.length ++;
    }


    /**
     * 根据下标删除
     * @param index 下标
     */
    public void remove(int index){
        if(index > this.length){
            return;
        }
        int count = 0;
        if(index == 0){
            this.next = this.next.getNext();
        } else {
            this.next.remove(index ,count);
        }

        this.length --;
    }

    /**
     * 根据元素删除
     * @param data
     */
    public void remove(Object data){
        if(this.next.equals(data)){
            this.next = this.next.getNext();
        } else {
            this.next.remove(data);
        }
    }


    /**
     * 根据下标获取元素
     */
    public Object get(int index){
        if(index > this.length){
            return null;
        }
        int count = 0;
        if(index == 0){
            return this.next.getDate();
        } else {
            return this.next.get(index, count);
        }
    }

    /**
     * 查询元素所在的位置
     */
    public int indexOf(Object data){
        int i = -1;
        if(this.next.getDate().equals(data)){
            i++;
            return i;
        } else {
            this.next.getNext().indexOf(data, i);
        }
        return i;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void print() {
        Next next = this.next;
        while (next != null){
            System.out.print(next.getDate() + ",");
            next = next.getNext();
        }
        System.out.println("");
    }


    private class Next{

        private Object date;
        private Next next;

        public Next(Object date){
            this.date = date;
        }
        public Next(Object date, Next next){
            this.date = date;
            this.next = next;
        }

        public int indexOf(Object data, int index){
            index ++;
            if(this.getDate().equals(data)){
                return index;
            }
            return this.getNext().indexOf(data, index);
        }

        /**
         * 集合内最后一位添加元素
         */
        public void add(Object data){
            if(this.next == null){
                this.next =  new Next(data);
            } else {
                this.getNext().add(data);
            }
        }

        /**
         * 根据下标删除
         */
        public void remove(int index, int count){
            count ++;
            if(count == index){
                this.setNext(this.getNext().getNext());
            } else {
                this.getNext().remove(index, count);
            }
        }

        public void remove(Object data){
            if(this.date.equals(data)){
                this.date = this.next;
            } else {
                this.getNext().remove(data);
            }
        }

        public Object get(int index, int count){
            count ++;
            if(index == count){
                return this.getNext().getDate();
            } else {
                return this.getNext().get(index, count);
            }
        }

        public Object getDate() {
            return date;
        }

        public void setDate(Object date) {
            this.date = date;
        }

        public Next getNext() {
            return next;
        }

        public void setNext(Next next) {
            this.next = next;
        }
    }

}
