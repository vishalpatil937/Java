package com.xoriant.multithreading;

import java.util.Scanner;

public class ProducerThread extends Thread {
	private Test test;
	public ProducerThread(Test test) {
		this.test=test;
		start();
	}
	
	@Override
	public void run() {
		int count=0;
		Scanner sc=new Scanner(System.in);
		while(true) {
			count=sc.nextInt();
			test.setNum(count);
		}
	}
}
