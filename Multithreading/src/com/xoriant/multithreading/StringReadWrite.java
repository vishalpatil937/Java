package com.xoriant.multithreading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StringReadWrite {
	public static void main(String[] args) {
		String str="Hola Amigo";
		
		ObjectOutputStream objop=null;
		ObjectInputStream objip=null;
		
		try {
			objop =new ObjectOutputStream(new FileOutputStream("copied_file"));
			objop.writeObject(str);
			
			objip=new ObjectInputStream(new FileInputStream("copied_file"));
			String s=(String)objip.readObject();
			System.out.println(s);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				objop.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
