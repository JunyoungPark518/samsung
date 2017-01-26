package samsung;

import java.util.Scanner;

/**
@FILE  : Test2_5.java
@DATE  : 2017. 1. 6.
@AUTHOR: J.John Park
@STORY
	다팔아닷컴은 최근 급성장한 인터넷 쇼핑몰이다. 얼마 전까지 우체국 택배를 이용하던 다팔아닷컴은 구매 상품을
	신속히 구매자에게 배송하는 서비스를 구현하기 위해 자체 배송 시스템을 운영하기로 했다. 이때 한 지역을 담당한
	택배 기사는 최단 시간 내에 n개의 배송지에 택배물을 배송하고자 한다. 배송지가 그래프로 표현되었을 때 시작점
	a 지점에서 모든 배송지에 가서 택배물을 배송하는 순서를 구하라(두 개의 정수를 하나의 연결노드로 표현한다.
	즉 1 2 1 3이면 1과 2, 1과 3이 연결되어 있다).
	
	입력 형태) 정점의 개수, 시작하는 정점을 입력하고, 그래프를 정수 형태로 표현하여 입력한다.
	(정점 1이 정점 2, 4, 5와 연결된 경우 1 2 1 4 1 5로 표현한다.)
	그래프의 마지막을 -1로 두번 입력한다. (단, 5개 이상 10개 이하)
	
	출력 형태) 시작 정점, 인접한 정점 형태로 반복하여 출력한다.
 */
public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 사이에 ','를 두면서 입력하세요.");
		String input = sc.next();
		int count = 0;
		String[] arr = new String[100];
		if(!input.equals(null)) {
			arr = input.split(",");
			count = arr.length;
		}
		int output[] = new int[count];
		
		output[0] = Integer.parseInt(arr[0]);
		output[1] = Integer.parseInt(arr[1]);
		// arr 1 2 / 1 3 / 2 4 / 2 5 / 4 8 / 5 8 / 3 6 / 3 7 / 6 8 / 7 8 / -1 -1
		for(int i=1; i<count/2; i++) {
			if(arr[2*i].equals(arr[i])) {
				output[2*i] = Integer.parseInt(arr[2*i+1]);
			}
		}
		
		// 출력부분
		for(int i=0; i<count-1; i++) {
			System.out.printf("%d %d\n", output[i], output[i+1]);
		}
	}
	
}
