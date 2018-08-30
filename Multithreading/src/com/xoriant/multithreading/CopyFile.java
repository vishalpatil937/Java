package com.xoriant.multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
	public static void main(String[] args) {
		FileInputStream ipstream=null;
		FileOutputStream ostream=null;
		try {
			ipstream=new FileInputStream("File_handling");
			ostream=new FileOutputStream("copied_file");
			byte[] b = new byte[4];
//			int count=0;
//			while(count!=4) {
//				ostream.write(ipstream.read());
//				ostream.write("\n".getBytes());
//				count++;
//			}
			ipstream.read(b);
			for(int i=0;i<4;i++) {
				ostream.write(b[i]);
				ostream.write("\n".getBytes());
			}
//			ostream.write(b);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
