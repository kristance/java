package com.tjoeun.interfaceTest3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

public class UserInfoClient {

	public static void main(String[] args) {
		
		String dbType = "";
//		FileInputStream 클래스는 파일에 저장된 데이터를 바이트 단위로 읽어온다.
		FileInputStream fis = null;
		
		try {
			String filepath = "./src/com/tjoeun/interfaceTest3/db.properties";
//			FileInputStream 클래스의 생성자로 읽어올 properties 파일의 경로와 이름을 넘겨주면 파일을 읽어온다.
			fis = new FileInputStream(filepath);
//			System.out.println("디스크에 파일이 존재합니다.");
			
//			read() 메소드는 FileInputStream 클래스 객체에서 1바이트의 데이터를 읽어온다.
//			read() 메소드는 코드값으로 읽어오기 때문에 문자로 출력하려면 형변환이 필요하다.
//			System.out.println((char) fis.read());
//			printf()에 출력 서식을 "%c"로 지정해서 출력하면 된다.
//			System.out.printf("%c\n", fis.read());
			
			/*
//			read() 메소드는 읽어들일 데이터가 있으면 읽어들인 데이터를 코드값으로 리턴하고 읽어들인 데이터가
//			없으면(끝까지 다 읽었으면) -1이 리턴된다.
			int ch;
			String prop = "";
//			()안의 ch = fis.read()를 먼저 실행해서 1바이트의 데이터를 읽어서 ch 변수에 저장한 후 ch 변수에
//			저장된 데이터와 -1과 비교한다.
			while ((ch = fis.read()) != -1) { // 읽어들인 데이터가 있는가?
				prop += (char) ch;
			}
			System.out.println(prop);
			String[] dbProp = prop.split("=");
			System.out.println(Arrays.toString(dbProp));
			dbType = dbProp[1];
			*/
			
//			Properties 클래스는 FileInputStream 클래스 객체로 읽어들인 properties 파일의 데이터를 읽어온다.
			Properties properties = new Properties();
//			load() 메소드로 FileInputStream 클래스 객체로 읽어들인 properties 파일을 읽어온다.
			properties.load(fis);
			
//			getProperty() 메소드로 인수로 지정한 properties 파일의 key("=" 왼쪽 부분)에 해당되는
//			value("=" 오른쪽 부분)을 얻어온다.
//			getProperty() 메소드의 2번째 인수로 properties 파일에 지정한 key가 존재하지 않을 경우 사용할 기본값을
//			지정할 수 있다.
//			System.out.println(properties.getProperty("DBTYPE", "잘못된 key"));
			dbType = properties.getProperty("DBTYPE", "잘못된 key");
			System.out.println("DBTYPE: " + dbType);
		} catch (FileNotFoundException e) {
			System.out.println("경로가 잘못되었거나 디스크에 파일이 존재하지 않습니다.");
			return;
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		UserInfoVO vo = new UserInfoVO();
		vo.setUserID("qwert");
		vo.setUserName("홍길동");
		vo.setUserPassword("12345");
		System.out.println(vo);
		
		UserInfoDAO dao = null;
		if (dbType.equals("MYSQL")) {
			dao = new UserInfoMySqlDAO();
		} else if (dbType.equals("ORACLE")) {
			dao = new UserInfoOracleDAO();
		} else {
			System.out.println(dbType + "은(는) 지원되지 않는 데이터베이스 입니다.");
			return;
		}
		
		dao.insertUserInfo(vo);
		dao.updateUserInfo(vo);
		dao.deleteUserInfo(vo);
		
	}
	
}















