package com.xoriant.multithreading;

import java.io.File;

public class FileList {
	public static void main(String[] args) {
		File folder =new File("D:\\");
		File[] list=folder.listFiles();
//		Files with particular extension
		File[] files_extension =list.clone();
		
		for(File file:list) {
			if(file.isFile()) {
				System.out.println(file);
				System.out.println((file.length()/1024)+" KB");
				System.out.println( "Can read:"+file.canRead()+"\t"+"Can Write:"+file.canWrite()+"\t"+"Can Exe:"+file.canExecute());
				System.out.println("Last Modified:"+file.lastModified());
				System.out.println("***************");
			}
		}
//		Display list with specific extensions
		System.out.println("\nList with an extension filter\n");
		for(int i=0;i<files_extension.length;i++) {
			if(files_extension[i].getName().endsWith("txt")) {
				System.out.println(files_extension[i]);
			}
		}
				
	}
}
