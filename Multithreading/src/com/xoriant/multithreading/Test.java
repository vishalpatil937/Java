package com.xoriant.multithreading;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
	private FileWriter fw=null;
	private String input;
	private boolean flag=true;
	public synchronized String getNum() {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		flag=true;
		notify();
		return input;
	}

	public synchronized void setNum(String input) {
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		this.input = input;
		System.out.println("PUT: "+input);
		try {
			fw=new FileWriter("copied_file",true);
			fw.write("\n");
			fw.write(input);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag=false;
		notify();
	}
}
