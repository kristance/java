package com.tjoeun.textFileIO;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class TextFileWriteTest {

	public static void main(String[] args) {
		
		Scanner scanner = null; // 키보드 입력에 사용할 Scanner
		PrintWriter printWriter = null; // 텍스트 파일로 출력에 사용할 PrintWriter
		
//		경로 지정방식은 절대경로 지정방식과 상대경로 지정방식이 있다.
//		절대경로는 작업중인 파일이 위치한 디스크 드라이브의 최상위(root) 폴더(디렉토리)부터
//		작업중인 파일이 위치한 폴더까지의 경로를 말한다.
//		상대경로는 작업중인 파일이 위치한 프로젝트 이름의 폴더(".")부터 작업중인 파일이 
//		위치한 폴더까지의 경로를 말한다.
//		"."은 현재 작업하는 파일이 위치한 경로를 의미하고 ".."은 현재 파일이 위치한 경로의 한단계
//		상위 경로를 의미한다.
		
//		python이나 c/c++의 "."은 화면에 열려있는 파일이 위치한 폴더를 의미하지만 java의 "."은
//		현재 화면에 열려있는 파일이 위치한 프로젝트 이름의 폴더를 의미하는 것에 주의한다.
		
//		경로 지정시 경로와 경로, 경로와 파일을 구분하는 구분자는 "\"가 기본이지만 에러가 발생되면
//		"\\"나 "/"로 수정한다.
		
//		절대경로
//		String filepath = "C:\\k_digital\\kdigital\\java\\workspace\\k20231214\\src\\com\\tjoeun\\textFileIO\\out.txt";
//		String filepath = "C:/k_digital/kdigital/java/workspace/k20231214/src/com/tjoeun/textFileIO/out.txt";
		
//		상대경로
//		String filepath = ".\\src\\com\\tjoeun\\textFileIO\\out.txt";
		String filepath = "./src/com/tjoeun/textFileIO/out.txt";
		
		try {
//			PrintWriter 클래스의 생성자에 출력 파일의 경로와 이름을 지정해서 출력 파일을 만든다.
			printWriter = new PrintWriter(filepath);
			scanner = new Scanner(System.in);
			
//			"QUIT"가 입력될 때 까지 반복하며 키보드로 입력한 데이터를 텍스트 파일에 저장한다.
			while (true) {
//				텍스트 파일에 저장할 데이터를 키보드로 입력받는다.
				System.out.print(">>> ");
				String str = scanner.nextLine().trim();
				
//				입력받은 내용이 "QUIT"일 경우 무한 루프를 탈출한다.
				if (str.toUpperCase().equals("QUIT")) {
					break;
				}
				
//				입력받은 데이터를 텍스트 파일에 저장한다.
//				write() 메소드로 PrintWriter 클래스 객체로 생성한 텍스트 파일에 출력한다.
//				write() 메소드로 텍스트 파일로 출력할 때 "\n"을 입력했음에도 불구하고 텍스트 파일에서
//				줄이 변경되서 보이지 않는다면 "\r\n"을 사용한다. => 순서를 바꾸면 안된다.
//				\n: new line, 줄을 바꾼다.
//				\r: carriage return, 커서를 그 줄의 맨 앞으로 보낸다.
				if (str.length() != 0) {
					printWriter.write(str + "\r\n");
				}
			}
			System.out.println("텍스트 파일로 저장 완료!!!");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일의 경로가 잘못되었거나 파일이 존재하지 않습니다.");
		} finally {
//			파일로 출력할 때는 출력 작업이 완료되면 반드시 close() 메소드로 파일을 닫아야 정상적으로
//			데이터가 파일에 저장된다.
			if (printWriter != null) {
				printWriter.close();
			}
		}
		
	}
	
}
















