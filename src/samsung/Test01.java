package samsung;

import java.util.Scanner;

// Selection Sorting
/**
@FILE  : Test1_1.java
@DATE  : 2016. 12. 21.
@AUTHOR: J.John Park
@STORY
	선택 정렬을 이용하여 성적을 오름차순으로 정렬하고, 학점을 규정에 따라 부여할 때
	3번째 학생의 학점을 구하라. 학점은 F, D, D+, C, C+, B, B+, A, A+(2명)으로 한다.
	
	(입력)
	10개의 정수를 공백을 기준으로 나누어 입력한다.
	
	(출력)
	입력된 정수를 오름차순으로 정렬하고, 각 정수 밑에 학점을 출력한다.
	3번째 학생의 학점을 출력한다.
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, grade[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int third = 0;
		String input = sc.next();
		for(int i=0; i<10; i++) {
			score[i] = Integer.parseInt(input.split(",")[i]);
			grade[i] = Integer.parseInt(input.split(",")[i]);
		}
		third = grade[2];
		
		for(int i=0; i<10; i++) {
			for(int j=i+1; j<10; j++) {
				if(score[i] > score[j]) {
					int temp = 0;
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
		}
		
		for(int i=0; i<10; i++) {
			System.out.print(score[i] + "  ");
		}
		System.out.println();
		for(int i=0; i<10; i++) {
			if(third==score[i]) {
				switch(i) {
				case 0: case 1:
					System.out.println("A+");
					break;
				case 2:
					System.out.println("A");
					break;
				case 3:
					System.out.println("B+");
					break;
				case 4:
					System.out.println("B");
					break;
				case 5:
					System.out.println("C+");
					break;
				case 6:
					System.out.println("C");
					break;
				case 7:
					System.out.println("D+");
					break;
				case 8:
					System.out.println("D");
					break;
				case 9:
					System.out.println("F");
					break;
				}
			}
		}
	}
}
