package com.xoriant.multithreading;

public class WriteFileThread extends Thread{
	private FileToFile f2f =null;
	public WriteFileThread(FileToFile f) {
		this.f2f=f;
		start();
	}
	
	@Override
	public void run() {
		f2f.setNum();
	}
	
}
