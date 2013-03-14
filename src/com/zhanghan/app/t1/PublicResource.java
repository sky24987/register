package com.zhanghan.app.t1;
/**
 * ������Դ��
 */
public class PublicResource {
	private int number = 0;

	/**
	 * ���ӹ�����Դ
	 */
	public synchronized void increace() {
		while (number !=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;
		System.out.println(number);
		notify();
	}

	/**
	 * ���ٹ�����Դ
	 */
	public synchronized void decreace() {
		while (number == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number--;
		System.out.println(number);
		notify();
	}
}