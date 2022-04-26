package com.javaex.practice4;
public class Ex08 {

	public static void main(String[] args) {
		
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 }; //12개
		int sum=0;
		int num=0;
		for(int i=0; i<12; i++) {
			if(data[i]%3==0) {
				sum = sum+data[i];
				num++;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + num);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
		
	}

}