package samsung;

import java.io.FileInputStream;
import java.util.Scanner;

/**
@FILE  : Test18.java
@DATE  : 2017. 1. 31.
@AUTHOR: J.John Park
@STORY
		1) 문제
		준성이의 엄마는 준성이의 석차를 알고 싶지만 학교정책상 등수를 알려주지 않아 준성이의 성적이 항상 궁금하다.
		다만 학교에서는 전체 인원수, 평균, 표준편차만을 제공해 주고 있다. 학생들의 성적이 정규분포를 이룬다고
		가정할 때, 준성이 엄마가 표준정규분포표를 이용하여 준성이의 점수에 대한 예상 등수를 알아내려고 한다.
		석차를 구할 수 있는 프로그램을 작성하여 예상되는 석차를 구하라.
		
		2) 제약사항
		원점수, 표준편차, 인원수는 정수 형태로, 전체 평균은 실수 형태로 입력한다.
		부록에 있는 정규분포표를 txt파일로 저장하여 파일 입력을 이용해야 한다.
		
		3) 입력
		학생이 맞은 원점수, 전체 평균, 표준편차, 인원수를 입력한다.
		
		4) 출력
		석차(등수)를 정수 형태로 출력한다.
 */
public class Test18 {
	// 이상한 문제
	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("");
			int[] 정규분포표 = new int[500];
			for(int i=0; i<500; i++) {
				정규분포표[i] = file.read();
			}
			Scanner sc = new Scanner(System.in);
			String[] input = sc.next().split(" ");
			int[] inputarr = new int[4];
			int score = 0, dispersion = 0, standard = 0; // 원점수, 분산, 표준편차
			double average = 0.0; // 전체 평균
			for(int i=0; i<inputarr.length; i++) {
				inputarr[i] = Integer.parseInt(input[i]);
			}
			score = inputarr[0];
		} catch (Exception e) {
			
		}
	}
}
