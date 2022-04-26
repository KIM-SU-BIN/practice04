//3의 배수의 개수와 배수의 합을 아래와 같이 출력
//int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };

package com.javaex.practice4;

public class Ex04 {

	public static void main(String[] args) {

		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 }; // 12개
		int sum = 0;
		int count = 0;

		for (int i = 0; i < data.length; i++) {
			if (data[i] % 3 == 0) {   // 주어진 배열을 3으로 나누면 나머지가 0이니? = 3의 배수니? 총 6개

			sum = sum + data[i];
			count++;
			
			}
		}

		System.out.println("주어진 배열에서 3의 배수의 개수 => " + count);
		System.out.println("주어진 배열에서 3의 배수의 합 => " + sum);

	}

}
