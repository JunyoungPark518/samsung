package samsung;

import java.util.Scanner;

/**
@FILE  : Test14.java
@DATE  : 2017. 1. 26.
@AUTHOR: J.John Park
@STORY
		1) 문제
		철수는 토끼한 쌍을 구매하여 집에서 키우게 되었다. 토끼는 다음과 같은 조건에 따라 생육 번식한다.
		- 태어난 지 두 달 이상이 된 토끼만 번식 가능하다.
		- 번식 가능한 토끼 한 쌍은 매달 새끼 한 쌍을 낳는다.
		- 토끼는 죽지 않고 계속 번식한다.
		즉, 첫 번째 달에는 토끼 한 쌍만 있고, 두 번째 달에도 토끼 한 쌍만 있고, 세 번째 달에는 두 달 이상
		된 토끼 한 쌍이 새끼 한 쌍을 낳으므로 총 두 쌍의 토끼가 존재한다.
		위의 조건 하에서 일정 기간이 지난 후의 토끼 쌍의 수를 구하여라.
		
		2) 제약사항
		입력 값 N은 10 <= N <= 100으로 입력한다.
		출력되는 정수는 2,147,483,647 이하의 정수이다. (자료형 int의 범위)
		한 줄에 10개만 출력하고 줄 이동하여 다음을 출력한다.
		
		3) 입력
		관찰할 기간을 입력한다.
		
		4) 출력
		일정 기간 후 토끼의 쌍을 출력한다. (입력받은 기간만큼 피보나치수열을 출력한다.)
 */
public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("3이상의 카운트 입력:");
		int count = sc.nextInt();
		int a = 1, b = 1, c = 0;
		if(count>2) {
			System.out.print(a + " " + b + " ");
			for(int i=0; i<count-2; i++) {
				c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;
			}
		}
	}
}
