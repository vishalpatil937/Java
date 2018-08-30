package com.xoriant.multithreading;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReadWriteUser {
	public static void main(String[] args) {
		User user=new User("Abc","pass");
		try(ObjectOutputStream objop=new ObjectOutputStream(new FileOutputStream("copied_file"));) {
			objop.writeObject(user);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
