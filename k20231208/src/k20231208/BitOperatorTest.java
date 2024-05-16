package k20231208;

public class BitOperatorTest {

	public static void main(String[] args) {
		
//		비트 연산자
//		&: 비트 and, 두 비트가 모드 1이면 1
//		|: 비트 or, 두 비트 중에서 1개 이상 1이면 1
//		^: 비트 xor(배타적 논리합), 두 비트가 다를 때 1
//		~: 비트 반전, 1은 0으로 0은 1로 반전, 1의 보수 계산
		
		int a = 10; // 0000 1010
		int b = 12; // 0000 1100
		
		System.out.println(a & b); // 0000 1010 & 0000 1100 => 0000 1000 => 8
		System.out.println(a | b); // 0000 1010 | 0000 1100 => 0000 1110 => 14
		System.out.println(a ^ b); // 0000 1010 ^ 0000 1100 => 0000 0110 => 6
		
//		~0000 1010 => 1111 0101 => 부호 비트가 1이므로 음수이고 다시 2의 보수로 변환하면 0000 1011이 되므로
//		출력하면 -11이 출력된다.
		System.out.println(~a);
		
	}
	
}
