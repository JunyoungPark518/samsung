package samsung;

import java.util.Scanner;

/**
@FILE  : Test3_1.java
@DATE  : 2017. 1. 6.
@AUTHOR: J.John Park
@STORY 
		편의점에서 아르바이트를 하는철수는 어느 날 자정을 넘긴 시간에 카운터를 보니 동전이 거의 떨어져 가는 상황에 놓이게
		놓이게 되었다. 동전을 교환하러 가기에는 너무 늦은 시간이라 고민에 빠진 철수는 최대한 큰 단위로 거스름돈을 내어
		주어 이 상황을 해결해보려고 결심했다. 즉 800원을 거슬러 줘야 한다면 거스름돈을 100원짜리 8개로 줄 수도 있지만,
		동전의 개수를 최소한으로 하려면 500원짜리 한 개와 100원짜리 3개를 내어 주는 것이다.
		
		문제 제시) 철수가 생각해 낸 가장 적은 수의 동전으로 거스름돈을 주는 방법을 프로그램으로 작성하라
		
		제약 사항) 동전의 가짓수가 5개이면 입력해야 하는 개수는 5를 포함하여 8개(가짓수, 동전의 종류 5개,
		물건가격, 지불한 돈)를 입력해야 한다.
		
		입력) 동전의 가짓수, 동전의 종류, 물건 가격, 지불한 돈을 입력한다.
		즉, 동전의 가짓수에 따라 입력값의 수가 결정된다.
		
		출력) 동전의 종류별로 몇개를 거스름돈으로 받는지를 출력한다. (즉, 동전의 종류의 개수만큼의 정수가 출력된다.)
 */
public class Test3_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String kinds = input.split(",")[0];
		int[] array = new int[10];
		int kindsint = Integer.parseInt(kinds);
		array[0] = Integer.parseInt(kinds);
		for(int i=1; i<=kindsint+2; i++) {
			array[i] = Integer.parseInt(input.split(",")[i]);
		}
		int productprice = array[kindsint+1];
		int submit = array[kindsint+2];
		int change = submit - productprice;
		int[] output = new int[kindsint];
		// calculate & print
		for(int i=0;i<kindsint;i++) {
			output[i] = change / array[i+1];
			change %= array[i+1];
			System.out.printf("%d\t", output[i]);
		}
	}
}
