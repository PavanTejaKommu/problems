package com.filehandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Program1 {
	
	public static void main(String[] args) throws IOException {
		String location = "C:\\Users\\K.Pavan Teja\\OneDrive\\Desktop\\Teja.txt";
		
		
		File file = new File(location);
		if(file.exists()) {
			System.out.println("File Already exist");
		}else {
			file.createNewFile();
		}
		
		FileOutputStream fos = new FileOutputStream(file);
		
		String str = "java is an hignlevel Programing Language";
		byte [] bytes = str.getBytes();
		fos.write(bytes);
		
		FileInputStream fis = new FileInputStream(location);
		
		for (byte b : bytes) {
			System.out.print((char)b);
		}
		System.out.println();
		
		System.out.println("------------------------");
		int i;
		while((i=fis.read()) !=-1) {
			
			System.out.print((char)i );
		}
		
		fis.close();
		
	}

}
