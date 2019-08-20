package com;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/8/11 01:05
 * @Description:
 */
public class MainTest {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("123","123");
        map.put("1234","123");
        map.put("12345","123");
//        for(Map.Entry entry : map.entrySet()){
//            if(entry.getKey().equals("1234")){
//                map.remove(entry.getKey());
//                System.out.println("删除了 = "+ entry.getKey() );
//           抛出异常     ConcurrentModificationException
//            }
//        }


//        for(String key : map.keySet()){
//            if(key.equals("1234")){
//                map.remove(key);
//                System.out.println("删除了 = "+key );
////           抛出异常     ConcurrentModificationException
//            }
//        }

//        Iterator<String> iterator = map.keySet().iterator();
//        while (iterator.hasNext()){
//            String next = iterator.next();
//            if(next.equals("1234")){
//                map.remove(next);
//                System.out.println("删除了 = "+ next );
////            抛出异常    ConcurrentModificationException
//            }
//        }


    }
}
