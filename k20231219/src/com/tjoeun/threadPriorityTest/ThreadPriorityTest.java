package com.tjoeun.threadPriorityTest;

public class ThreadPriorityTest {

	public static void main(String[] args) {

//		스레드 우선 순위는 1 ~ 10 사이의 값을 지정할 수 있다.
//		우선 순위가 높은 스레드가 CPU의 할당을 받을(실행될) 확률이 높다.
		System.out.println("MAX_PRIORITY : " + Thread.MAX_PRIORITY); // 10
		System.out.println("MIN_PRIORITY : " +Thread.MIN_PRIORITY); // 1
		System.out.println("NORM_PRIORITY : " +Thread.NORM_PRIORITY); // 5, 기본값
		/*
		ThreadPriority tp1 = new ThreadPriority("1번 스레드");
		ThreadPriority tp2 = new ThreadPriority("2번 스레드");
		ThreadPriority tp3 = new ThreadPriority("3번 스레드");
		
//		setPriority() 메소드로 스레드의 우선 순위를 지정할 수 있다.
		tp1.setPriority(Thread.NORM_PRIORITY);
		tp2.setPriority(Thread.MIN_PRIORITY);
		tp3.setPriority(Thread.MAX_PRIORITY);
	
		tp1.start();
		tp2.start();
		tp3.start();
		*/
		
		for (int i = Thread.MIN_PRIORITY; i <= Thread.MAX_PRIORITY; i++) {
			ThreadPriority tp = new ThreadPriority("스레드 - " + i);
			if(i == 5) {
				tp.setPriority(Thread.MAX_PRIORITY);
			} else {
				tp.setPriority(Thread.MIN_PRIORITY);;
			}
			tp.start();
		}
		
		
		
	}

}
