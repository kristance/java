package k20231207;

public class CalendarTest {

//	메소드의 형식, []로 묶는 내용은 생략이 가능하다.
//	[접근 권한 지정자] [static] 리턴타입 메소드이름([인수, ...]) { // 메소드의 머리
//		메소드가 실행할 문장;
//		...
//		[return 값;]
//	} // {} 블록을 메소드의 몸통이라고 한다.
	
//	접근 권한 지정자
//	private: 현재 클래스 외부에서 실행할 수 없다.
//	protected: 현재 클래스와 현재 클래스를 상속받은 자식 클래스에서만 실행할 수 있다.
//	package: 접근 권한 지정자를 생략하면 package 권한으로 간주된다. default로 불린적이 있다.
//			 같은 패키지에서는 public 처럼 사용되고 다른 패키지에서는 private 처럼 사용된다.
//	public: 현재 클래스 내부, 외부 어디에서나 자유롭게 실행할 수 있다.
	
//	static(정적)으로 선언한 메소드는 메소드가 작성된 클래스의 객체를 생성하지 않고 클래스 이름에
//	"."을 찍어서 실행할 수 있다. => 자주 사용하는 메소드는 정적 메소드로 만들어 사용하면 편리하다.
	
//	리턴 타입은 메소드가 실행되고 난 후 결과의 자료형을 적는다.
//	메소드를 실행한 후 결과가 없다면 return을 생략할 수 있과 return을 생략하면 리턴 타입에는
//	"void"라고 적어준다.
	
//	년도를 인수로 넘겨받아 윤년, 평년을 판단해 윤년이면 true, 평년이면 false를 리턴하는 메소드
//	논리값을 기억하는 변수는 논리값을 리턴하는 메소드의 이름은 "is"로 시작하는 것이 관행이다.
	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
	}
	
//	년, 월을 인수로 넘겨받아 그 달의 마지막 날짜를 리턴하는 메소드
	public static int lastDay(int year, int month) {
//		각 달의 마지막 날짜를 기억하는 배열을 선언한다.
		int[] m = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//		2월의 마지막 날짜를 확정한다.
		m[1] = isLeapYear(year) ? 29 : 28;
//		마지막 날짜를 리턴한다.
		return m[month - 1];
	}
	
//	년, 월, 일을 인수로 넘겨받아 1년 1월 1일 부터 지나온 날짜의 합계를 계산해서 리턴하는 메소드
	public static int totalDay(int year, int month, int day) {
//		전년도 12월 31일까지 지난 날짜의 합계를 계산한다.
		int sum = (year - 1) * 365 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
//		전년도 12월 31일까지 지난 날짜의 합계에 전달까지 지난 날짜를 더한다.
		for (int i = 1; i<month; i++) {
			sum += lastDay(year, i);
		}
//		전달까지 지난 날짜의 합계에 일을 더해서 리턴한다.
		return sum + day;
	}
	
//	년, 월, 일을 인수로 넘겨받아 요일을 숫자로 계산해 리턴하는 메소드
//	일요일(0), 월요일(1), 화요일(2), 수요일(3), 목요일(4), 금요일(5), 토요일(6)
	public static int weekDay(int year, int month, int day) {
		return totalDay(year, month, day) % 7;
	}
	
//	JVM은 자바 프로그램이 실행되기 전에 static으로 선언된 메소드나 변수를 메모리에 올려준다.
//	모든 메소드는 메소드가 실행되기 전 메모리에 적재되어야 한다.
//	main() 메소드가 메모리에 적재되어 있지 않으면 프로그램의 시작점인 main() 메소드를 호출할 수
//	없으므로 프로그램을 실행할 수 없다.
//	그래서 main() 메소드는 누군가가 호출하기 전에 JVM이 메모리에 적재시킨다.
	public static void main(String[] args) {
		
//		System.out.println(isLeapYear(2023));
//		System.out.println(lastDay(2024, 2));
//		System.out.println(totalDay(2023, 12, 7));
//		System.out.println(weekDay(2023, 12, 7));
		
		
		
	}
	
}























