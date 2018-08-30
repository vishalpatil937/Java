package com.xoriant.multithreading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLines {
	public static void main(String[] args) {
		FileReader r=null;
		try {
			r=new FileReader("copied_file");
			int i,count=0;
			while((i=r.read())!=-1) {
				if((char)i== '\n') {
					count++;
				}
				else if(count==3) {
					break;
				}
				System.out.print((char)i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
