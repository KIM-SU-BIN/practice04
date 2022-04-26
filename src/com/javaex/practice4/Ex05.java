//Ex05 5개의 숫자를 키보드로 입력받아 평균을 구하는 프로그램을 작성하세요.
//1. 입력받기 때문에 Scanner
//2. 평균 공식
package com.javaex.practice4;

import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] Array = new int[5];  //5개의 숫자를 입력 -> 같은 생동을 5번 반복하므로 배열사용
		
		int sum = 0;                    //시작은 0 (아무 과정도 거치지 않은 상태)
		for(int i=0; i<5; i++) {
			Array[i] = sc.nextInt();
			sum = sum + Array[i];  // i = 입력값 즉, 입력값과 이전에 더해진 값(시작은 0)을 더한다는 의미!
		}                                    //이걸 풀어쓰면 어떻게 써야하는가?
		
		
		System.out.println("평균은 " + sum/5.0 + "입니다."); 

		sc.close();

	}
}

/*javaex.ex05 - Ex01,03
 			int no1, no2, no3, no4, no5 ;
			
			no1 = (int) (Math.random()*45)+1;
			no2 = (int) (Math.random()*45)+1;
			no3 = (int) (Math.random()*45)+1;
			no4 = (int) (Math.random()*45)+1;
			no5 = (int) (Math.random()*45)+1;
			
			System.out.println(no1);
			System.out.println(no2);
			System.out.println(no3);
			System.out.println(no4);
			System.out.println(no5);
			
			for(int i=0; i<6; i++) { 
			nums[i] = (int)(Math.random()*45+1); } --> 랜덤으로 수를 받기 때문에 
			
			Array[i] = sc.nextInt();
			sum = sum + Array[i];  위의 예제처럼 쓸 필요 x 
			*/
