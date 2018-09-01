package com.xoriant.multithreading;

public class ReadWriteMain {
	public static void main(String[] args) {
		FileToFile f=new FileToFile();
		new ReadFileThread(f);
		new WriteFileThread(f);
	}
}
