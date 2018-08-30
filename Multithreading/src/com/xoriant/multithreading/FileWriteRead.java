package com.xoriant.multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteRead {
	public static void main(String[] args) {
		FileWriter w=null;
		FileReader r=null;
		
		try {
//			w=new FileWriter("copied_file");
//			w.write("Hola Amigo-2");
//			w.flush();
//			w.close();
			
			r=new FileReader("copied_file");
			int i;
			while((i=r.read())!=-1)
				System.out.print((char)i);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
//			try {
//				w.flush();
//			} catch (IOException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
		}
	}
}
