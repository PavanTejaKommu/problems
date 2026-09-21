package com.strings;

public class Example7 {

	public void program4() {
		String str = "Java";

		int count = 0;
		for(int i =0; i < str.length();i++) {

			char ch = str.charAt(i);

			if(ch == 'a' || ch == 'e' || ch =='i' || ch =='o' || ch == 'u') {
				count++;
			}

		}
		System.out.println("Vowels : "+count);
	}



	public void program5() {
		// count digits , alphabets , special charcaters 

		int digitCount = 0; 
		int alphaCount =0;
		int specialCount = 0;

		String str = "java@123";

		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);

			if(ch>='A' && ch<='Z' || ch >='a' && ch<='z') {
				alphaCount++;

			} else if(ch>=0 && ch <= '9') {
				digitCount ++;

			}else {
				specialCount++;
			}
		}


		System.out.println("Alpabets Count : "+alphaCount);
		System.out.println("Digit Count : "+digitCount);
		System.out.println("Special Characters Count : "+specialCount);

	}

	public void programSample() {
		String str[] = {"java is awesome"};
		for(int i = str[0].length()-1;i>=0;i--) {
			System.out.print(str[0].charAt(i));

		}
	}
	
	public void program6() {
		String str = "pavanteja";
		
		
		for(int i =0; i < str.length();i++) {
			char ch = str.charAt(i);
			
			if(ch >='a' && ch  <= 'z') {
				ch = (char)(ch-32);
				
				System.out.print(ch);
			}
		}
//		System.out.println(	str.toUpperCase());

	}
	
	
	public void program7() {
		String str = "PAVANTEJA";
		
		for(int i =0; i  < str.length();i++) {
			
			char ch = str.charAt(i);
			
			if(ch >= 'A' && ch <='Z') {
				ch = (char)(ch + 32 );
			
			System.out.print(ch);
				
			}
		}
	}
	
	public void program8() {
		String str = "java is awesome";
		
		System.out.println(str.charAt(0));
		
	}




	public static void main(String[] args) {
		Example7 obj = new Example7();

		//		obj.program4();
//				obj.program5();
//		obj.programSample();
//		obj.program6();
		obj.program7();

	}

}
