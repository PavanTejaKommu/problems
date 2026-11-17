package com.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution_1431 {
	public static void main(String[] args) {
		int[] candies = new int[]{2, 3, 5, 1, 3};
		int extraCandies = 3;


		int max =0; 
		List<Boolean> l = new ArrayList<>();
		int index =0;

		while(index < candies.length){

			if(candies[index] > max) max=candies[index];
			candies[index] = candies[index]+extraCandies;
			index++;
		}

		for(int i=0;i<candies.length;i++){
			if(candies[i] >= max){
				l.add(true);
			}else{
				l.add(false);
			}
		}
		System.out.println(l);

	}

}



/**class Solution {
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		int max =0; 
		List<Boolean> l = new ArrayList<>();
		for(int i=0;i<candies.length;i++){
			if(candies[i] > max)max=candies[i];

		}
		for(int j=0;j<candies.length;j++){
			int sum = candies[j] + extraCandies;
			if(sum >= max){
				l.add(true);
			}else{
				l.add(false);
			}
		}

		List<Boolean> l = new ArrayList<>();
		int index =0;
		while(index < candies.length){
			if(candies[index] > max) max=candies[index];
			candies[index] = candies[index]+extraCandies;
			index++;
		}
		for(int i=0;i<candies.length;i++){
			if(candies[i] >= max){
				l.add(true);
			}else{
				l.add(false);
			}
		}
		return l;    
	}
}
*/
