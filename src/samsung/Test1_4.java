package samsung;

import java.util.Scanner;

// Quick Sorting
/**
@FILE  : Test1_4.java
@DATE  : 2016. 12. 22.
@AUTHOR: J.John Park
@STORY
	문화관광부에서 복지 재원을 확보하기 위해 디지털복권을 신규로 만들었다.
	1~1,000까지의 숫자에서 무작위로 10개를 뽑아서 당첨금을 지급한다.
	
	당첨번호 10개와 복권 구매자가 선택한 10개의 숫자를 오름차순으로 각각 정렬하라.
	그리고 당첨된 번호가 몇 개인지 출력하라.
	
	(입력)
	정렬이 되어 있지 않은 당첨번호 10개를 입력하고, 그 다음 줄에 선택번호 10개를 입력한다.
	
	(출력)
	오름차순으로 정렬된 당첨번호와 선택한 번호를 각각 출력하고, 다음 줄에 당첨된 번호와
	개수를 출력하라.

 */
public class Test1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("당첨번호 10개 입력");
		String input = sc.next();
		System.out.println("선택번호 10개 입력");
		String input2 = sc.next();
		int[] array = new int[10], array2 = new int[10];
//		int[] array = {482,241,454,325,452,685,498,890,281,121}, array2 = {486,242,454,325,453,685,499,891,282,122};
		for (int i = 0; i < 10; i++) {
			array[i] = Integer.parseInt(input.split(",")[i]);
			array2[i] = Integer.parseInt(input2.split(",")[i]);
		}
		quickSort(array, 0, 9);
		quickSort(array2, 0, 9);

		for (int i=0; i<9; i++) {
			System.out.println(array[i] + "  ");
			System.out.println(array2[i] + "  ");
		}
	}

	// 분할 함수
	// 매개변수로 array, 왼쪽값, 오른쪽 값을 받음
	public static int partition(int[] arr, int left, int right) {
		int pivot = arr[(left + right) / 2]; // 피벗으로 배열의 중간 값을 초기값으로 지정
		while (left < right) { // left와 right가 겹칠때까지 진행
			if(arr[left] < pivot) {
				left++;
			} else if (arr[right] < pivot) {
				right--;
			}
			if (left < right) { // 원소 값 대치
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return left; // left 값 반환
	}

	// 퀵 정렬 함수
	public static void quickSort(int[] arr, int left, int right) {
		if (left < right) {
			int pivotNewIndex = partition(arr, left, right);

			quickSort(arr, left, pivotNewIndex - 1); // 왼쪽 값과
			quickSort(arr, pivotNewIndex + 1, right); // 오른쪽 값의 비교 후 정렬
		}
	}

}
