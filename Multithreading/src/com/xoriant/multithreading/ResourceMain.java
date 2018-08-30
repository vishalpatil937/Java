package com.xoriant.multithreading;

public class ResourceMain {
	public static void main(String[] args) {
		Resource resource=new Resource();
		new ResourceThread(resource,"Hello World");
		new ResourceThread(resource,"JAVA");
		new ResourceThread(resource,"Ala");
	}
}
