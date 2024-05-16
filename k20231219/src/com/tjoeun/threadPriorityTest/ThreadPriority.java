package com.tjoeun.threadPriorityTest;

public class ThreadPriority extends Thread{

	public ThreadPriority() {
	}
//	Thread 클래스 객체가 생성될 때 스레드 이름을 지정하는 생성자
	public ThreadPriority(String name) {
//		부모(Thread) 클래스의 생성자를 호출해서 스레드의 이름을 지정할 수 있다.
		super(name);
	}
	
	
	
	@Override
	public void run() {
		
//		현재 스레드 객체를 만든다.
		Thread thread = Thread.currentThread();
		
//		setName() 메소드로 스레드 이름을 지정할 수 있다.
//		Thread 클래스 객체가 생성된 후 스레드 이름을 지정한다.
//		thread.setName("스레드 이름이 같아진다.");
		
		int sum = 0;
		for (int i = 1; i <= 100000; i++) {
			sum += i;
		}
	
//		getName() 메소드로 스레드 이름을 얻어올 수 있다.
//		getPriority() 메소드로 스레드의 우선 순위를 얻어올 수 있다.
		System.out.println(thread.getName() + " 우선 순위 :" + thread.getPriority());
	}

	
	
	
}
