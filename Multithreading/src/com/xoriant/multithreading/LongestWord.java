package com.xoriant.multithreading;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LongestWord {
	public static void main(String[] args) {
//		FileReader r=null;
		
		try(FileReader r=new FileReader("copied_file")) {
			int longest_word=0,word_length=0;
			int charac;
			while((charac=r.read())!=-1) {
//				System.out.println((char)charac);
				if(charac!=32) {
					word_length++;
					System.out.println((char)charac);
				}
				else {
					if(word_length>longest_word) {
						longest_word=word_length;
						System.out.println("Length of longest word="+longest_word);
					}
					word_length=0;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
