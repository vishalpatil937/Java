package com.xoriant.multithreading;

public class Test {
	private int num;
	private boolean flag=true;
	public synchronized int getNum() {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		flag=true;
		notify();
		return num;
	}

	public synchronized void setNum(int num) {
		
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		this.num = num;
		System.out.println("PUT: "+num);
		flag=false;
		notify();
	}
}
