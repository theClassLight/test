package com.gg;
/*
 *Administrator
 *2022/9/1 21:19
 */

public class test {
	MyThread a = new MyThread();
	class MyThread extends Thread {
		volatile boolean stop = false;
		
		public void run() {
			while (!stop) {
				System.out.println(getName() + " is running");
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("week up from blcok...");
					stop = true; // 在异常处理代码中修改共享变量的状态
				}
			}
			System.out.println(getName() + " is exiting...");
		}
	}
	class a{
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		test test = new test();
		MyThread m1= test.new MyThread();
		
		System.out.println("Starting thread...");
		m1.start();
		Thread.sleep(3000);
		System.out.println("Interrupt thread...: " + m1.getName());
//		m1.stop = true; // 设置共享变量为true
		
		m1.interrupt(); // 阻塞时退出阻塞状态
		boolean interrupted = m1.isInterrupted();
		System.out.println(interrupted);
		Thread.sleep(3000); // 主线程休眠3秒以便观察线程m1的中断情况
		System.out.println("Stopping application...");
	}
}
class JoinTest2 {
	// 1.现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行
	public static void main(String[] args) {
		final Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("t1");
			}
		});
		final Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
// 引用t1线程，等待t1线程执行完
					t1.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t2");
			}
		});
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
// 引用t2线程，等待t2线程执行完
					Thread.sleep(1000);
					t2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("t3");
			}
		});
		t3.start();//这里三个线程的启动顺序可以任意，大家可以试下！
		t2.start();
		t1.start();
	}
}
