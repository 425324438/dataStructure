package com.line;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/7/21 17:07
 * @Description:
 */
public class MyListTest {

    public static void main(String[] args) {
        com.line.MyList<String> list = new com.line.MyList<>();

        list.add("aasd");
        list.join(list,list,list,list,list);

        for(int i = 0;i < list.getLength(); i ++){
            System.out.println(list.getElement(i));
        }
    }
}