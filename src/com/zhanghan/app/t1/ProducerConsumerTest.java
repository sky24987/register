package com.zhanghan.app.t1;
public class ProducerConsumerTest {
	public static void main(String[] args) {
		PublicResource resource = new PublicResource();
		new Thread(new ProducerThread(resource)).start();
		new Thread(new ConsumerThread(resource)).start();

	}
}