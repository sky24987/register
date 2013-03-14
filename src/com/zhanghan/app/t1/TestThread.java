package com.zhanghan.app.t1;

class Seq {
	private static int number = 0;
	private static Seq seq = new Seq();

	private Seq() {
	}

	public static Seq getInstance() {
		return seq;
	}

	public int get() {
		number++; // £¨a£©
		return number;// £¨b£©
	}
}

public class TestThread {
	public static void main(String[] args) {
		Seq.getInstance().get();// £¨1£©
		Seq.getInstance().get();// £¨2£©
	}
}