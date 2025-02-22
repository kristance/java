package k20231207;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String java = new String("java");
		System.out.println(java);
//		identityHashCode() 메소드는 문자열이 메모리에 생성된 주소를 보여준다.
		System.out.println(System.identityHashCode(java));
		
		String jsp = new String("jsp");
		System.out.println(jsp);
		System.out.println(System.identityHashCode(jsp));
		
		java = java + jsp;
		System.out.println(java);
//		String을 연결하면 기존의 String에 연결되는 것이 아니고 새로운 String 객체가 생성된다.
		System.out.println(System.identityHashCode(java));
		
//		concat() 메소드는 "+"를 이용한 것 처럼 문자열을 연결한다.
		java = java.concat(jsp);
		System.out.println(java);
		System.out.println(System.identityHashCode(java));
		
		String str = new String("");
		long start = System.currentTimeMillis(); // 시작 시간
		for (int i = 0; i<100000; i++) {
			str += "꽝";
		}
		System.out.println("실행 시간: " + (System.currentTimeMillis() - start));
		System.out.println("String을 사용해서 꽝 10만번 연결하기");
		System.out.println("===================================================");
		
		String html = new String("html");
		String css = new String("css");
		
//		StringBuilder는 String 처럼 문자열을 새로 만들지 않고 내부적으로 char[] 배열을 변경한다.
		StringBuilder builder = new StringBuilder(html);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
//		append() 메소드로 StringBuilder 객체에 문자열을 추가한다.
		builder.append(css);
		System.out.println(builder);
		System.out.println(System.identityHashCode(builder));
		
		StringBuilder str2 = new StringBuilder("");
		start = System.currentTimeMillis();
		for (int i = 0; i<100000; i++) {
			str2.append("꽝");
		}
		System.out.println("실행 시간: " + (System.currentTimeMillis() - start));
		System.out.println("StringBuilder를 사용해서 꽝 10만번 연결하기");
		System.out.println("===================================================");
		
//		StringBuffer는 멀티 스레드 프로그램에서 동기화(순서를 정한다)를 보장하므로 멀티 스레드 프로그램은
//		StringBuffer를 사용하고 단일(싱글) 스레드 프로그램은 StringBuilder를 사용하는 것을 권장한다.
		StringBuffer str3 = new StringBuffer("");
		start = System.currentTimeMillis();
		for (int i = 0; i<100000; i++) {
			str3.append("꽝");
		}
		System.out.println("실행 시간: " + (System.currentTimeMillis() - start));
		System.out.println("StringBuffer를 사용해서 꽝 10만번 연결하기");
		System.out.println("===================================================");
		
		String str4 = "개울가에\n올챙이\n한마리\n꼬물꼬물\n헤엄치다";
		System.out.println(str4);
		
//		text block => JDK 13에서 추가
//		문자열을 """와 """ 사이에 입력하면 \n을 사용하지 않고 엔터키를 입력해서 줄바꿈되는 여러줄 문자열을
//		만들어 사용할 수 있다.
		String strBlock = """
				개울가에
				올챙이
				한마리
				꼬물꼬물
				헤엄치다
				""";
		System.out.println(strBlock);
		
	}
	
}




















