package com.xoriant.multithreading;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class PrimitiveWrite {
	public static void main(String[] args) {
		FileOutputStream fileop=null;
		DataOutputStream dataop=null;
		FileInputStream fileip=null;
		DataInputStream dataip=null;
		try {
			fileop=new FileOutputStream("copied_file");
			dataop=new DataOutputStream(fileop);
			dataop.writeUTF("Hola Amigo");
			dataop.writeInt(54);
			dataop.writeLong(98987);
			dataop.writeFloat(76.875f);
			
			fileip=new FileInputStream("copied_file");
			dataip=new DataInputStream(fileip);
			System.out.println(dataip.readUTF());
		} catch ( IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
