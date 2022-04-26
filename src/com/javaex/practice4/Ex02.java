//Ex02 double 형 배열 을 작성하고 1.2, 3.3, 6.7 값을 순서대로 입력하고 아래와 같이 출력되도록 for문을 작성하세요.

package com.javaex.practice4;

public class Ex02 {
	
	public static void main(String[] args) {
		
		double[] array = new double[3];
		
		array[0] = 1.2;   
		array[1] = 3.3;
		array[2] = 6.7;
		
		for(int i=0; i<array.length; i++) {  //double 아니고 int!!!!!!! for(int i=0; i<**; i++) 이게 공식
			System.out.println(array[ i]); 
		}		
		
	}

}
