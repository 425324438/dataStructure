package com.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/**
 * @author: 425324438@qq.com
 * @Date: 2019/8/20 23:13
 * @Description:
 */
public class RedisLock implements Lock {


    @Override
    public void lock() {

    }

    @Override
    public boolean tryLock() {
        return false;
    }


    @Override
    public void unlock() {

    }



    @Override
    public boolean tryLock(long time, TimeUnit unit) throws InterruptedException {
        return false;
    }
    @Override
    public void lockInterruptibly() throws InterruptedException {

    }


    @Override
    public Condition newCondition() {
        return null;
    }
}
