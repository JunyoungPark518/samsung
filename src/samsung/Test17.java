package samsung;

import java.util.Scanner;

/**
@FILE  : Test17.java
@DATE  : 2017. 1. 31.
@AUTHOR: J.John Park
@STORY
		1) 문제
		꽃집에 백합, 국화, 장미꽃이 모두 합하여 100송이가 있다. 이 꽃을 모두 판매하였더니 54,700원을 벌었다.
		백합, 국화, 장미는 한 송이에 각각 2,000원, 900원, 500원이다. 또한 꽃잎의 개수는 각각 6개, 25개,
		10개이다. 이를 3차 연립방정식으로 나타내면 다음과 같다.
		x + y + z = 100
		2,000x + 900y + 500z = 54,700
		6x + 25y + 10z = 1,160
		(단, x는 백합, y는 국화, z는 장미꽃의 수)
		이를 행렬로 나타내면 m = {{1, 1, 1},{2000, 900, 500},{6, 25, 10}} 인데, 각각의 꽃의 개수는
		역행렬을 구해서 풀면 쉽게 구할 수 있다.
		
		입력된 정수 9개로 행렬 {{-1,1,2},{3,-1,1},{-1,3,4}}를 만들었을 때, 이 행렬의 역행렬을 구하라.
		그리고, 연립방정식을 행렬로 표현하면 
		(-1 1 2)(x)   ( 5)
		(3 -1 1)(y) = (10)
		(-1 3 4)(z)	  ( 5)
		가 된다. 이때 연립방정식의 해 x,y,z의 값을 구하라.
		
		2) 제약사항
		출력 값을 계산하는 과정에서 행렬의 원소는 정수가 아닌 실수로 변환이 된다.
		
		3) 입력
		3x3 행렬을 9개의 정수 형태로 입력한다. 행렬의 형태를 유지하기 위해 한 줄이 9개의 정수를 입력한다.
		그 다음 줄에 상수항을 순서대로 입력한다.
		
		4) 출력
		역행렬을 한 줄에 3개의 실수 형태로 출력한다. 방정식의 해는 한 줄 띄우고 출력한다.
 */
public class Test17 {
	// 미해결 코드, 입력받는 부분까지만 설정해둠.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("9개의 정수 입력");
		String[] input = sc.next().split(" ");
		double[] inputnum = new double[9];
		for(int i=0; i<9; i++) {
			inputnum[i] = Double.parseDouble(input[i]);
		}
		System.out.println("3개의 상수항 입력");
		String[] solution = sc.next().split(" ");
		double[] solutionnum = new double[3];
		for(int i=0; i< 3; i++) {
			solutionnum[i] = Double.parseDouble(solution[i]);
		}
		
	}
}
