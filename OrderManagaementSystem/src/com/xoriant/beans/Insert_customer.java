package com.xoriant.beans;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Insert_customer {
	public static void main(String[] args) {
		FileInputStream fileip=null;
		DataInputStream dataip=null;
		
		ArrayList<Integer> customer_id=new ArrayList<>();
		ArrayList<String> customer_name=new ArrayList<>();
		ArrayList<String> customer_address=new ArrayList<>();
		ArrayList<String> customer_email=new ArrayList<>();
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("customer_details"));
			String line;
			String fields[]=null;
			int i=0;
			while((line=br.readLine())!=null) {
				fields=line.split(" ");
				customer_id.add(Integer.parseInt(fields[0]));
				customer_name.add(fields[1]);
				customer_address.add(fields[2]);
				customer_email.add(fields[3]);
				i++;
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
