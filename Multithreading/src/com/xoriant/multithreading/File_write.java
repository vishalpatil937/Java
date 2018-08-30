package com.xoriant.multithreading;

import java.io.FileOutputStream;
import java.io.IOException;

public class File_write {
	public static void main(String[] args) {
		FileOutputStream opstream=null;
		String str="(2)Xoriant madhe tumcha swagat ahe !";
		try {
			opstream=new FileOutputStream("File_handling",true);
			opstream.write(str.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				opstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
