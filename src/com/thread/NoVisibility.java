package com.thread;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/8/4 22:28
 * @Description:
 */
public class NoVisibility {

    public static boolean ready;

    public static int number;

    private static class ReaderThread extends Thread{

        @Override
        public void run() {
            while (! ready){
                Thread.yield();
            }
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }

}
