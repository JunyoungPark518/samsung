package samsung;

import java.util.Scanner;

/**
@FILE  : Test2_4.java
@DATE  : 2016. 12. 30.
@AUTHOR: J.John Park
@STORY
	XOR 암호화
	메시지는 아스키코드로 변환하게 되면 0과 1로 표현이 가능하다. 입력된 메시지와 키를 2진수로 표현하고,
	이를 XOR 연산한 결과가 암호문이 된다. 암호문 역시 2진수이므로 이를 아스키코드로 변환하면 이해가 가능한
	문자 형태로 변환이 된다. 평문으로 복호화하려는 방법은 암호문에 키를 XOR 연산하는 것이다. (M XOR K) XOR K=M이
	되는 것은 XOR 연산의 특징이다.

	입력) 
	첫 번째 줄은 키 값으로 정수 형태로 입력한다. 다음 줄은 암호화할 평문(문자열)을 입력한다.
	
	출력)
	암호화된 문자를 출력한다. Character 형을 사용한다.
 */
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 값 정수를 입력하세요.");
		int input = sc.nextInt();
		String str = String.valueOf(input);
		System.out.println("암호화할 평문(문자열)을 입력하세요.");
		String inputpw = sc.next();
		String result = "", resultpw = "";
		// 입력값을 String으로 변환한 후 문자열 길이에 맞춰 마지막 문자열 까지 XOR연산
		for(int i=0; i<str.length()-1; i++) {
			char a1 = str.charAt(i);
			char a2 = str.charAt(i+1);
			result += xor(a1, a2);
		}
		for(int i=0; i<inputpw.length()-1; i++) {
			char a1 = inputpw.charAt(i);
			char a2 = inputpw.charAt(i+1);
			resultpw += xor(a1, a2);
		}
		System.out.println("키 값 이진수 변환:" + result);
		System.out.println("문자열 암호화 후:" + resultpw);
	}
	
	// XOR 연산 메소드, XOR 연산 String 반환
	public static String xor(int a1, int a2) {
		int i = a1^a2;
		return Integer.toBinaryString(i);
	}
}
