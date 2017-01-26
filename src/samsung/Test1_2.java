package samsung;

import java.util.Scanner;

// Insertion sorting
/**
@FILE  : Test1_2.java
@DATE  : 2016. 12. 21.
@AUTHOR: J.John Park
@STORY
	삽입정렬을 이용하여 오름차순으로 출전자들을 정렬하라.
	
	(입력)
	10개의 입력된 정수 중에서 위치를 알고자 하는 정수 하나를 입력한다.
	
	(출력)
	가장 작은 수부터 정렬하여 나열한다.
	추가로 입력된 정수의 위치를 출력한다.
 */
public class Test1_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }, temp = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		System.out.println("수를 10개 입력");
		int key = 0, newValue = 0;
		String input = sc.next();
		for (int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(input.split(",")[i]);
			temp[i] = Integer.parseInt(input.split(",")[i]);
		}
		
		int j = 0;
		for(int i=0; i<10; i++) {
			key = array[i];
			j = i - 1;
			while(j>=0 && array[j] > key) {
				array[j+1] = array[j];
				j = j-1;
			}
			array[j+1] = key;
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(array[i] + "  ");
		}
		System.out.print("\n삽입할 정수를 입력하세요:");
		newValue = sc.nextInt();
		for(int i=0; i<10; i++) {
			if(temp[i]>newValue) {
				System.out.println(i+1);
				break;
			}
		}
	}
}
