package samsung;

import java.util.Scanner;

/**
@FILE  : Test4_1.java
@DATE  : 2017. 1. 6.
@AUTHOR: J.John Park
@STORY
		1) 문제
			소수는 1과 자기 자신 이외에는 약수가 존재하지 않는 자연수를 의미한다. 1이 아닌 p가 소수일 필요충분조건은
			p가 p|m*이고 m=ab를 만족하는 임의의 자연수 a,b에 대해 p|a 이거나 p|b이다. 일반적으로 안전하게 개인키,
			공개키를 생성하기 위해 큰 소수가 필요하다. 이러한 소수를 찾는 방법을 고민해 보고 있다.
			
		2) 문제 제시 및 제약사항
			입력된 두 자연수 범위에 있는 소수를 모두 찾아 출력하라. 입력한 두 정수 N, M은 100<=N, M<=1000 인 수이고,
			N과 M(M>N)의 차이가 큰 수이다.
			
		3) 입력
			2개의 양의 정수 N, M을 입력한다.
			
		4) 출력
			입력한 범위 내에 모든 소수의 수를 출력한다. (각 줄마다 10개가 나오면 다음 줄로 이동하여 출력한다.)
			마지막에 한 줄을 띄어 주어진 범위 내에 있는 소수의 개수를 출력한다.
 */
public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 N,M을 입력:");
		String input = sc.next();
		int n = Integer.parseInt(input.split(",")[0]), m = Integer.parseInt(input.split(",")[1]);
		int count = 0, h = 0;
		int[] prime = new int[100];
		for(int i=1; i<100; i++) {
			int counter = 0;
			for(int num=i; num>=1; num--) {
				if(i%num==0) {
					counter++;
				}
			}
			if(counter==2) {
				prime[h] = i;
				h++;
			}
		}
		int val = n;
		for(int i=0; i<100;) {
			if(val%prime[i]!=0) { // 솟수로 나누어 떨어지지 않을때
				System.out.println(val + " ");
			} else { // 솟수로 나누어 떨어질때
				val++;
			}
		}
		System.out.println(count);
	}
}
