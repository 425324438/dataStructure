package com.line;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/21 13:08
 * @Description: 线性表
 */
public class MyList<E> {

    private static final Object[] EMPTY_VALUES = {};

    //初始长度
    private static final int DEFAULT_SIZT = 10;

    private int length;

    private Object[] values;

    public MyList(){
        this.length = 0;
        this.values = new Object[DEFAULT_SIZT];
    }

    /**
     * 获取元素下标
     */
    public int indexOf(E element){
        int index = -1;
        for(int i =0 ;i < this.length; i ++ ){
            if(this.values[i].equals(element)){
                return index;
            }
        }
        return index;
    }

    /**
     * 根据下标删除元素
     * @param index 下标
     */
    public void remove(int index){
        if(index <= this.length){
            this.values[index] = null;
            //此位置之后的数据保持与之前的连续，保证数组中间没有null值
            for(int i = index; i <= this.length; i++){
                this.values[i] = this.values[i +1];
                if( i == this.length){
                    this.values[i] = null;
                }
            }
        }
    }

    public boolean isEmpty(){
        return this.length == 0 ;
    }

    public int getLength(){
        return this.length;
    }

    public E getElement(int index){
        return (E) this.values[index];
    }

    /**
     * 获取元素下标相邻的下一个位置指向的值
     * @param element 软塑入参
     * @return 返回下一个元素
     */
    public E NextElement(E element){
        int indexOf = indexOf(element);
        return (E) this.values[indexOf +1];
    }

    public void add(E element){
        if(this.length == this.values.length){
            //扩容
            this.values = expansion(0);
        }
        addObject(element);
    }

    private void addObject(E element) {
        this.length++;
        this.values[this.length -1 ] = element;
    }

    /**
     * 数组扩容（默认两倍扩容）
     */
    private Object[] expansion(int size) {
        if(size <= 0){
            size = this.length * 2;
        }
        Object[] array = new Object[size];
        System.arraycopy(this.values, 0, array, 0, this.length);
        return array;
    }

    /**
     * 连接集合
     */
    public void join(MyList... list){
        Object[] temp = new Object[0];
        for(MyList mList : list){
            //存储当然对象的值
            System.arraycopy(temp, 0, this.values, 0, this.length);
            //扩容
            this.values =  expansion(this.length + mList.length);
            this.length += mList.length;

            //把当前对象存储的值 join 上新进来的值
            for(int i =0 ;;){

            }
        }
    }




}
