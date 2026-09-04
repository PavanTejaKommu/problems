package com.abstraction;

import java.util.Scanner;

abstract class ReportGenerator{
	abstract void  generateContent();
	abstract void openFile();
	abstract void writeContent();
	abstract void savaFile();
	public ReportGenerator() {
		super();
	}
}


class PDFReport extends ReportGenerator{
	
	
	String blockText;

	public PDFReport(String blockText) {
		super();
		this.blockText = blockText;
	}

	@Override
	void generateContent() {
System.out.println("Generating PDF content with block text.");		
	}

	@Override
	void openFile() {
System.out.println("Oening  pdf File ");		
	}

	@Override
	void writeContent() {
System.out.println("Writing content to pdf File ");		
	}

	@Override
	void savaFile() {
System.out.println("Saving pdf File");		
	}
	
	
	
}

class ExcelReport extends ReportGenerator{
	String tabularData;

	public ExcelReport(String tabularData) {
		super();
		this.tabularData = tabularData;
	}

	@Override
	void generateContent() {
System.out.println("Generating Excel content with tabular data.");		
	}

	@Override
	void openFile() {
System.out.println("Oening excel File ");		
	}

	@Override
	void writeContent() {
System.out.println("Writing content to excel File ");		
	}

	@Override
	void savaFile() {
System.out.println("Saving excel File");		
	}
	
	
}



class HTMLReport extends ReportGenerator{
	String markupContent;

	public HTMLReport(String markupContent) {
		super();
		this.markupContent = markupContent;
	}
	@Override
	void generateContent() {
System.out.println("Generating HTML content with markup.");		
	}

	@Override
	void openFile() {
System.out.println("Oening HTML File ");		
	}

	@Override
	void writeContent() {
System.out.println("Writing content to HTML File ");		
	}

	@Override
	void savaFile() {
System.out.println("Saving HTML File");		
	}
	
}

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Select your choice : \n1.Pdf\n2.Excel\n3.HTML");
		int key = sc.nextInt();
		sc.nextLine();
		switch (key) {
		case 1: {
			
			ReportGenerator pdf = new  PDFReport("Sample Report"); 
			pdf.generateContent();
			pdf.openFile();
			pdf.writeContent();
			pdf.savaFile();
			
			 break;
		}
		case 2: {
			
			ReportGenerator excel = new  ExcelReport("Sample Report");
			excel.generateContent();
			excel.openFile();
			excel.writeContent();
			excel.savaFile();
			 break;
		}
		case 3: {
			
			ReportGenerator html = new HTMLReport("Smaple");
			html.generateContent();
			html.openFile();
			html.writeContent();
			html.savaFile();
			
			 break;
		}
		default:
System.out.println("Invalid input");
}
		
		
		sc.close();
		
	}

}
