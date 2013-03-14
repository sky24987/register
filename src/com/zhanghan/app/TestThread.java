package com.zhanghan.app;

public class TestThread {
	int i = 0, j = 0;

	public void go(int flag) {
		while (true) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("Interrupted");
			}
			if (flag == 0) {
				i++;
				System.out.println("i=" + i);
			} else {
				j++;
				System.out.println("j=" + j);
			}
		}
	}

	public static void main(String[] args) {
		
		new TestThread().go(0);
		new TestThread().go(1);
		
	}
}