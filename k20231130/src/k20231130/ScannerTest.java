package k20231130;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {

//		상수: 프로그램에서 처리할 데이터를 의미한다.
//		변수: 프로그램에서 처리할 데이터(상수)를 기억하는 기억장소를 말한다.
//		변수 이름은 영문자, 숫자, 특수문자(_)를 사용해서 만들고 첫 글자는 반드시 문자로 시작해야 한다.
//		예약어는 변수 이름으로 사용하면 안된다.
		
//		변수 선언 방법
//		자료형 변수이름; // 변수만 선언한다. => 변수에는 쓰레기가 들어있다.
//		자료형 변수이름 = 초기치; // 변수를 선언하고 초기치로 초기화시킨다.
//		변수는 변수를 선언한 후 최초로 사용하기 전에 반드시 초기화시켜야 한다.
		
//		"="의 의미는 "=" 오른쪽의 데이터를 "=" 왼쪽의 기억장소에 대입(할당, 배정)시키라는 의미로 사용된다.
//		=> 대입문, 할당문, 배정문 => "=="가 같다로 사용된다.
		
		int num;
		num = 100;
		System.out.println("num: " + num);
		
//		클래스이름 객체이름 = new 생성자();
		Scanner scanner = new Scanner(System.in); // 키보드로 입력받는 스캐너
		
//		키보드로 입력받은 데이터를 변수에 저장한다.
		System.out.print("주소: ");
//		next(): 한 단어 입력
//		nextLine(): 한 줄 입력
//		스캐너로 키보드로 입력하는 데이터를 입력받을 경우 바로 변수에 저장되는 것이 아니고 키보드 버퍼라는
//		임시 기억장소에 저장된 후 읽어들이는 메소드가 실행될 때 변수에 저장된다.
//		nextLine() 메소드는 키보드 버퍼가 비어있으면 입력을 기다리며 대기하지만 키보드 버퍼가 비어있지 
//		않으면 키보드 버퍼의 내용을 끝까지 읽어들인다.
		String addr = scanner.nextLine();
		System.out.print("이름: ");
		String name = scanner.nextLine();
		
		System.out.println(name + "님은 " + addr + "에 삽니다.");
		System.out.printf("%s님은 %s에 삽니다.\n", name, addr);
		
	}
	
}


















