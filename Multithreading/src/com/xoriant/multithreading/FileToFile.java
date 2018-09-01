package com.xoriant.multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileToFile {
	private FileInputStream fip=null;
	private DataInputStream dip=null;
	
	private FileOutputStream fop=null;
	private DataOutputStream dop=null;
	
	private int num;
	private int sum=0;
	private boolean flag=false;
	public synchronized int getNum() throws FileNotFoundException {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		fip=new FileInputStream("copied_file");
		dip=new DataInputStream(fip);
		try {
			num=dip.readInt();
			sum+=num;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		flag=true;
		notify();
		return num;
	}

	public synchronized void setNum() {
		
		if(flag==false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		try {
			fop=new FileOutputStream("cumulative_sum");
			dop=new DataOutputStream(fop);
			dop.writeInt(sum);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		flag=false;
		notify();
	}
}

