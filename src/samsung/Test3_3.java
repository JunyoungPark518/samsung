package samsung;

import java.util.Scanner;

/**
@FILE  : Test3_3.java
@DATE  : 2017. 1. 6.
@AUTHOR: J.John Park
@STORY
		1) 문제
			정배가 어머니와 진료를 받기 위해 병원을 찾아 갔다. 그런데 병원은 환자가 너무 많아 상당한 시간을 기다려야
			했다. 정배는 자신의 순서가 언제쯤 오는지 궁금해지기 시작했다. 또한, 이런 패턴으로 환자가 찾아온다면 최대
			얼마나 많은 환자가 오는지와, 대기 환자 수, 가장 길게 대기하는 길이가 궁금하다. 이를 위해 대기행렬 모의실험을
			위한 프로그램을 작성하였다.
			
		2) 문제 제시
			대기 행렬을 이용하여 정해진 시간 내에 찾아온 전체 환자 수와 현재 진료 중인 환자 수, 최대로 대기할 때의 수를
			출력하라.
			
		3) 제약사항
			대기행렬의 모의실험의 특성상 출력 예는 입력 예와 관계없이 유동적이어야 한다. 즉, 난수를 적절하게 초기화해야
			한다. 여기에서는 입력 예에 의해 결과를 고정화하기 위해 난수 초기화는 하지 않는다.
			
		4) 입력
			양의 정수 3개(고객 도착 시간, 서비스 시간, 실험 시간)를 입력한다.
			
		5) 출력
			양의 정수 3개(서비스 받은 고객, 대기행렬에 남아 있는 고객 수, 최대 대기 고객 수)를 출력한다.
 */
public class Test3_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		int[] array = new int[3];
		for(int i=0; i<array.length; i++) {
			array[i] = Integer.parseInt(input.split(",")[i]);
		}
		int arrivalTime = array[0], serviceTime = array[1], expTime = array[2];
		int servicedCustomer = 0, leftCustomer = 0, maxWaitedCustomer = 0;
		double rand = Math.random()*100;
		int operatingTime = (int) rand;
		if(operatingTime > serviceTime) {
			// print
			System.out.printf("%d %d %d",servicedCustomer,leftCustomer,maxWaitedCustomer);
			return;
		} else {
			if(arrivalTime>rand) {
				maxWaitedCustomer++;
				leftCustomer++;
			}
			// 알고리즘이 무슨말인지 모르겠음.
		}
		
		
	}
}
