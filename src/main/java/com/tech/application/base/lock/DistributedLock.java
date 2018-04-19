package com.tech.application.base.lock;

/**
 * 分布式锁
 * 
 * @author chenzhicong
 */
public interface DistributedLock {
	/**
	 * 释放锁
	 */
	void unlock();

	/**
	 * 尝试获得锁，能获得就立马获得锁，如果不能获得就立马返回
	 */
	boolean tryLock();

	/**
	 * 尝试获得锁，一直阻塞，直到获得锁为止
	 */
	void lock();
}
