package com.xoriant.multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ProducerThread extends Thread {
	private Test test;
	FileWriter fw=null;
	public ProducerThread(Test test) {
		this.test=test;
		start();
	}
	
	@Override
	public void run() {
		String input;
		try {
			fw=new FileWriter("copied_file",true);
		} catch (IOException e) {
			e.printStackTrace();
		}
		Scanner sc=new Scanner(System.in);
		while(true) {
			input=sc.next();
			test.setNum(input);
		}
		
	}
}
