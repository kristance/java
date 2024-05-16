package k20231130;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("나이: ");
		int age = scanner.nextInt();
		
//		nextLine()을 제외한 나머지 메소드는 공백을 경계로 데이터를 읽어들인다.
//		nextLine()을 제외한 나머지 메소드 자신이 읽어들일 데이터만 읽어들인다.
//		=> 마지막에 입력된 엔터키는 읽어들이지 않는다.
		
//		키보드 버퍼를 비운다.
		scanner.nextLine();
		
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + age + "살 입니다.");
		System.out.printf("%s님은 %d살 입니다.\n", name, age);
		System.out.println(name + "님은 내년에 " + (age + 1) + "살 입니다.");
		
	}
	
}
