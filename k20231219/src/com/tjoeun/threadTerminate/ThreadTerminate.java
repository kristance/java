package com.tjoeun.threadTerminate;

public class ThreadTerminate extends Thread {

	private boolean flag = true;
	
	public ThreadTerminate() {
	}
	public ThreadTerminate(String name) {
		super(name);
	}
	
	public boolean isFlag() {
		return flag;
	}
	public void setFlag(boolean flag) {
		this.flag = flag;
	}
	
	
	@Override
	public void run() {
		
		Thread thread = Thread.currentThread();
		
		while(flag) {
			try {
//				Thread.sleep(1);
//				 멀티 스레드를 만들 때 Thread 클래스를 상속받아 만들면 Thread 상속받았기 때문에
//				Thread 클래스의 모든 기능을 사용할 수 있으므로 static 메소드를 실행할 때 앞에
//				Thread를 쓰지 않아도 사용할 수 있다.
				sleep(1); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	 System.out.println(thread.getName() + " end");	
	}
	
	
	
	
}
