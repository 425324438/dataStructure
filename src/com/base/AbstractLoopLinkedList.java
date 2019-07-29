package com.base;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/29 23:42
 * @Description: 循环链表抽象类
 */
public abstract class  AbstractLoopLinkedList {

    /**
     * 向下插入数据
     */
    public abstract void addDown();

    /**
     * 向上插入数据
     */
    public abstract void addUp();

    /**
     * 根据元素获取其上一个位置的数据
     * @param data 元素
     * @return 上一个位置的数据
     */
    public abstract Object getUp(Object data);

    /**
     * 根据元素索引获取其 上一个位置的元素
     * @param index 索引
     * @return 上一个位置的元素
     */
    public abstract Object getUp(int index);

    /**
     * 根据元素获取其下一个位置的数据
     * @param data 元素
     * @return 下一个位置的数据
     */
    public abstract Object getDown(Object data);

    /**
     * 根据元素索引获取其 下一个位置的元素
     * @param index 索引
     * @return 下一个位置的元素
     */
    public abstract Object getDown(int index);

    /**
     * 根据元素索引删除
     */
    public abstract void remove(int index);

    /**
     * 根据元素删除
     */
    public abstract void remove(Object data);

    /**
     * 查询元素位置
     * @return 不存在返回 -1
     */
    public abstract int indexOf(Object data);



    public abstract void print();

}
