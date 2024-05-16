package com.tjoeun.textFileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextFileReadTest {

	public static void main(String[] args) {
		
		Scanner scanner = null; // 텍스트 파일의 데이터를 읽어들이는 스캐너
//		String filepath = "./src/com/tjoeun/textFileIO/out.txt";
		String filepath = "./src/com/tjoeun/textFileIO/in.txt";
		
		try {
//			Scanner 클래스 객체를 만들때 생성자로 "System.in"을 넘겨주면 키보드로 입력받는 스캐너가
//			만들어지지만 파일의 경로와 이름을 이용해서 생성한 File 클래스 객체를 넘겨주면 파일에서
//			데이터를 읽어들이는 스캐너가 만들어진다.
//			File file = new File(filepath);
//			scanner = new Scanner(file);
			scanner = new Scanner(new File(filepath));
			
//			텍스트 파일에서 더 이상 읽어들일 데이터(줄)이 없을 때 까지 반복하며 읽어들인다.
//			hasNextLine() 메소드는 스캐너로 읽어들일 파일에서 다음에 읽을 데이터가 있으면 true,
//			없으면 false를 리턴한다.
			while (scanner.hasNextLine()) { // 텍스트 파일에 읽어들일 데이터가 있는 동안 반복한다.
				String str = scanner.nextLine().trim();
				if (str.length() != 0) {
					System.out.println(str);
				}
			}
			
			System.out.println("텍스트 파일에서 읽기 완료!!!");
		} catch (FileNotFoundException e) {
			System.out.println("파일의 경로가 잘못되었거나 파일이 존재하지 않습니다.");
		} finally {
//			출력 용도로 사용하는 PrintWriter 클래스 객체는 작업이 완료되면 반드시 close() 메소드를
//			실행해서 파일을 닫아야 하지만 입력 용도로 사용하는 Scanner 클래스 객체는 파일을 닫지 않아도
//			정상적으로 처리된다.
			if (scanner != null) {
				scanner.close();
			}
		}
		
	}
	
}
