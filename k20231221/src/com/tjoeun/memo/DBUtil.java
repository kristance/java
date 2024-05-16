package com.tjoeun.memo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

//	MySQL에 연결하는 Connection을 만들어 리턴하는 메소드
	public static Connection getMySQLConnection() {

		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver"); // MySQL 5.x 사용자
//			Class.forName("com.mysql.cj.jdbc.Driver"); // MySQL 8.x 사용자
			String url = "jdbc:mysql://localhost:3306/javaam?useUnicode=true&characterEncoding=UTF-8"; // MySQL 5.x 사용자
//			String url = "jdbc:mysql://localhost:3306/javaam?serverTimezone=UTC"; // MySQL 8.x 사용자
			conn = DriverManager.getConnection(url, "root", "0000");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 클래스가 없거나 읽어올 수 없습니다.");
		} catch (SQLException e) {
			System.out.println("데이터베이스 접속 정보가 올바르지 않습니다.");
		}
		return conn;

	}

//	데이터베이스 작업에 Connection 객체를 닫는 메소드
	public static void close(Connection conn) {

		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
