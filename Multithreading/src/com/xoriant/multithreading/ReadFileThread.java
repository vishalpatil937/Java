package com.xoriant.multithreading;

import java.io.FileNotFoundException;

public class ReadFileThread extends Thread {
	private FileToFile f2f=null;
	public ReadFileThread(FileToFile f) {
		this.f2f=f;
		start();
	}

	@Override
	public void run() {
		try {
			f2f.getNum();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
