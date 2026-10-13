package com.filehandlings;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("sample.text");
		
		fw.write("File reader one ");
		
		fw.write("\n file reader two");
		
		
		fw.close();
		
		
		FileReader fr = new FileReader("sample.text");
		int i =0;
		while((i=fr.read()) != -1) {
			System.out.print((char)i);
			i++;
		}
	}

}
