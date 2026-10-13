package com.filehandlings;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program4 {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\K.Pavan Teja\\OneDrive\\Desktop\\sample.jpg");
		FileWriter fw = new FileWriter("log.png");
		int i =0;
		while((i=fr.read()) != -1) {
			System.out.println((char) i);
		}
		
		
		while((i=fr.read()) != -1) {
			fw.write((char)i);
		}

		fr.close();
		fw.close();
	}

}
