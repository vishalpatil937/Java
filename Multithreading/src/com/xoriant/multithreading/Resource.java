package com.xoriant.multithreading;

public class Resource {
	public synchronized void printMsg(String msg) {
		System.out.print("[ "+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.print(" ] ");
	}
}
