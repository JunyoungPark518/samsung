package samsung;

import java.util.Scanner;

// Binary Searching
/**
@FILE  : Test2_1.java
@DATE  : 2016. 12. 22.
@AUTHOR: J.John Park
@STORY
	전화번호부는 가나다 순으로 정렬되어 있기 때문에 김준성의 전화번호를 쉽고 빠르게 찾을 수 있다.
	파일에 저장된 숫자들이 오름차순으로 정렬되어 있다고 하자.
	찾고자 하는 숫자가 파일에 저장된 숫자 중에서 몇 번째에 위치하는지를 이진탐색 방법을 통해
	찾는 프로그램을 작성하라. (이진탐색은 정렬된 데이터 집합을 이분화하면서 탐색하는 방법이다.)
	
	(입력)
	자연수 배열의 원소 개수를 입력하고, 그 다음 줄에 정렬된 정수 배열을 앞에 입력한 개수만큼 입력한다.
	그리고 찾고자 하는 수를 입력한다.
	
	(출력)
	선택된 자연수 배열에서 원하는 위치를 출력한다.
 */
public class Test2_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int input = 0;
		System.out.println("자연수 배열의 원소 개수 입력");
		input = sc.nextInt();
		int[] arr = new int[input];
		System.out.println("배열을 입력하세요:");
		String s = sc.next();
		for(int i=0; i<input; i++) {
			arr[i] = Integer.parseInt(s.split(",")[i]);
		}
		
		while(true) {
			System.out.println("찾으려는 수 입력:");
			int find = sc.nextInt();
			int location = binary(arr, input-1, find);
			if(location!=-1) {
				System.out.println("찾으려는 데이터는 " + (location+1) + "위치에 있습니다.");
			} else {
				System.out.println("데이터를 찾을 수 없습니다.");
			}
		}
		
	}
	
	// 이진탐색 함수
	// arr는 원래 배열을, length는 배열의 길이, findData는 찾으려는 수
	public static int binary(int arr[], int length, int findData) {
		int low = 0, half = 0; // 배열의 최소 및 중간 값 정의
		while(low <= length-1) { // 최소가 끝까지 도달할 때 까지 루프
			half = (low + length-1) / 2; // 중간 지점 정의하여 2개의 자식 노드를 갖는 트리로 나눔
			if(arr[half] > findData) { 
				length = half - 1;
			} else if (arr[half] < findData) {
				low = half + 1;
			} else {
				return half; // 데이터를 찾은 경우 그 인덱스를 반환
			}
		}
		return -1; // 찾는 데이터가 없을 경우
	}
}
