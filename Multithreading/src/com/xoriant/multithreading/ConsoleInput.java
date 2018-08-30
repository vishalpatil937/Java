package com.xoriant.multithreading;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInput {
	public static void main(String[] args) {
		BufferedReader br=null;
		br=new BufferedReader(new InputStreamReader(System.in));
			try {
				String ip=br.readLine();

				System.out.println("Input:"+ip);
				int input=Integer.parseInt(ip);
				System.out.println(ip);
				System.out.println("-----------------------------");
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
