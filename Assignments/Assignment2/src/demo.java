
public class demo {

	
	private void getAverage() {
		int arr1[] = {
				1,2,3,4,5
		};
		int count=0;
		int sum=0;
		for(int i =0;i< arr1.length;i++) {
			count++;
			sum +=arr1[i];
		}
		
		double average = sum/count;
		System.out.println("Sum : "+sum);
		System.out.println("Count : "+count);
		System.out.println("Average : "+average);
		
	}
	
	public static void main(String[] args) {
		
		demo d = new demo();
		d.getAverage();

	}

}
