package com.xoriant.multithreading;

public class ConsumerThread extends Thread{
	private Test test;
	public ConsumerThread(Test test) {
		this.test=test;
		start();
	}
	@Override
	public void run() {
		while(true) {
			System.out.println("GOT: "+test.getNum());
		}
	}
}