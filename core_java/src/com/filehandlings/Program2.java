package com.filehandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Program2  {
	
	public static void main(String[] args) throws IOException {
		
		String locationFile1 = "C:\\File Handling Tasks\\one.txt";
		String locationFile2 = "C:\\File Handling Tasks\\two.txt";
		
		File file1 = new File(locationFile1);
		File file2 = new File(locationFile2);
		
		String content = "sample program inserting the data into file one ";
		
		byte [] bytes= content.getBytes();
		
		FileOutputStream fos = new FileOutputStream(locationFile1);
		
		fos.write(bytes);
		
		FileInputStream fis = new FileInputStream(locationFile1);
		int data;
		while((data=fis.read()) != -1) {
			System.out.print((char)data);
		}
		
		
		FileOutputStream fos2 = new FileOutputStream(locationFile2);
		
		byte [] bytes2 = fis.readAllBytes();
		
		
		
		fos2.write(bytes);
		
		int data2;
		
		FileInputStream fis2 = new FileInputStream(locationFile2);
		System.out.println();
		
		while((data2 = fis2.read()) != -1) {
			
			System.out.print((char)data2);
			
		}
		
	
		fis.close();
		fis2.close();
		
		
	}

}
