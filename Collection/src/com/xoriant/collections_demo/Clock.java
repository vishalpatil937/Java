package com.xoriant.collections_demo;

public class Clock extends Thread{
	@Override
	public void run() {
		for(int hr=0;hr<60;hr++) {
			for(int min=0;min<60;min++) {
				for(int sec=0;sec<60;sec++) {
					System.out.print("\r"+hr+":"+min+":"+sec);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t=new Thread(new Clock());
//		t.start();
		System.out.print("Ho;la");
		System.out.print("\b\b\b\b\b\b\b\bhii");
		
	}
}
