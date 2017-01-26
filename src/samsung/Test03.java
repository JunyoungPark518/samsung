package samsung;

import java.util.Scanner;

// Merge sorting
/**
@FILE  : Test1_3.java
@DATE  : 2016. 12. 22.
@AUTHOR: J.John Park
@STORY
	준성이가 컴퓨터 파일 정리를 하고 있다. 필요 없는 파일을 삭제하고 남은 파일을 순서대로 나열하고 싶다.
	파일 이름이 숫자로 되어 있다. 남은 파일을 병합정렬 알고리즘을 이용하여 오름차순으로 정렬하라.
	
	(입력)
	자연수의 개수를 입력한다.
	그 다음 줄에 정렬이 되어 있지 않은 자연수 배열을 입력한다.
	
	(출력)
	오름차순으로 정렬된 자연수를 배열로 출력한다.
 */
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("자연수 입력:");
		int count = sc.nextInt();
		int[] array = new int[count];
		int[] temp = new int[count];
		String scan = "100,99,98,97,94,95,96,93,92,91,90,89,88,87,86,85";
		for (int i = 0; i < count; i++) {
			array[i] = Integer.parseInt(scan.split(",")[i]);
		}
		// Sorting place
		int a =0, o = 0, r =0;
		while(true) {
			if(array[a]> array[o]) {
				temp[r] = array[o];
				o++;
			} else {
				temp[r] = array[a];
				a++;
			}
			r++;
			if(a >= array.length) {
				for(int k=o; k< array.length; k++) {
					temp[r] = array[k];
					r++;
				}
				break;
			} else if(o >= array.length) {
				for(int k= a; k<array.length; k++) {
					temp[r] = array[k];
					r++;
				}
				break;
			}
		}
		
		// print
		for (int i = 0; i < count; i++) {
			System.out.print(temp[i] + "  ");
		}
	}

}
