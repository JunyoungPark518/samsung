package samsung;

import java.util.Scanner;

/**
@FILE  : Test16.java
@DATE  : 2017. 1. 31.
@AUTHOR: J.John Park
@STORY
		1) 문제
		초등학생 시연이는 가족과 함께 주말에 피자를 주문하여 먹곤 한다. 이번 주말에는 피자를 패밀리 사이즈로
		주문하였다. 시연이는 갑자기 주문한 피자의 실제 넓이가 궁금해졌다. 패밀리 피자의 실제 넓이를 구하기
		위해 필요한 것은 반지름X반지름X원주율이라는 것을 알지만 시연이가 원주율의 값이 무엇인지 몰라 넓이를
		구하지 못하고 있다. 이를 해결하기 위해 원주율을 구하는 프로그램을 작성하라.
		원주율은 다음과 같은 라이프니츠 급수를 이용하여 주어진 오차 범위 내에서 구한다.
		라이프니츠 급수 공식 : π = 4*Σ(-1)^(n-1) / 2n-1
		
		2) 제약사항
		입력 값 N은 N >= 200의 자연수를 입력한다.
		
		3) 입력
		주어진 공식에서 반복하는 n을 입력 값으로 계산하고자 한다.
		반복 횟수를 입력한다.
		
		4) 출력
		실수의 형태로 소수점 아래 6자리까지 출력한다.
 */
public class Test16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
	}
}
