package com.xoriant.multithreading;

import java.io.FileInputStream;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		FileInputStream inputstream=null;
		
		try {
			inputstream =new FileInputStream("File_handling");
			int vachla;
			while((vachla=inputstream.read())!=-1) {
				System.out.print((char)vachla);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				inputstream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
