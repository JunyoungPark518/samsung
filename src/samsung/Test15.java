package samsung;

import java.util.Scanner;

/**
@FILE  : Test15.java
@DATE  : 2017. 1. 31.
@AUTHOR: J.John Park
@STORY	
		1) 문제
		SAQ 연구회에서 수련회를 갔다. 간식 시간에 바나나와 토마토를 배급하려고 한다.
		집행부에서 바나나1,587,645개와 토마토 67,545개를 준비하였다. 집행부에서 회원들을 팀으로 나눈어서
		팀별로 남는 과일 없이 바나나와 토마토를 똑같이 나누어주었다. 집행부에서팀의 개수를 최대로 만든다면 몇 팀이나 되겠는가?
		추가로 바나나와 토마토를 더 많이 구입하여 팀별로 바나나 개수와 토마토 개ㅅ수가 같게 나누어주었다. 수련회가 끝난 후에 
		확인해 보니 총 구입한 바나나의 개수와 토마토의 개수가 같았다.
		총 구입한 바나나의 개수를 구하여라.
		
		2) 제약사항
		입력하는 2개의 자연수는 5자리 이상 10자리 이하로 입력한다.
		
		3) 입력
		2개의 자연수를 공백을 기준으로 입력한다.
		
		4) 출력
		입력한 2개의 정수보다 작거나 같은 한 개의 정수(최대공약수)와 입력한 2개의 정수보다 크거나 같은 한 개의 정수(최소공배수)를
		출력한다. (최대 공약수가 21억보다 커질 경우를 대비하여 unsigned int로 선언한다.)
		최소공배수가 42억 이상인 경우 "큰 수"라고 출력한다.
 */
public class Test15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] input = sc.next().split(" ");
		int num1 = Integer.parseInt(input[0]), num2 = Integer.parseInt(input[1]);
		int gcd = 0, lcm = 0, temp1 = 0, temp2 = 0, remain = 0;
		if(num1 >= num2) {
			temp1 = num1;
			temp2 = num2;
		} else {
			temp2 = num1;
			temp1 = num2;
		}
		while(true) {
			remain = temp1 % temp2;
			temp1 = temp2;
			temp2 = remain;
			if(remain == 0) {
				gcd = temp1;
				break;
			}
		}
		lcm = (int) (num1 * num2 / gcd);
		System.out.printf("%d %d", gcd, lcm);
	}
}
